package com.hemanth.javathings.java8features.methodreference;

import com.hemanth.javathings.java8features.stream.example.Employee;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MethodReferencesDemo {


    /*
     * static method reference
     *
     * instance method reference
     *
     * constructor reference
     *
     * */

    public static List<Employee> loadEmployeesFromDB() {
        return IntStream.rangeClosed(1, 10)
                .mapToObj(i -> new Employee(i, "employee" + i, "A", new Random().nextInt(1000 * 100)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        MethodReferencesDemo methodReferencesDemo = new MethodReferencesDemo();


        // anonymous implementation
        loadEmployeesFromDB()
                .forEach(new Consumer<Employee>() {
                    @Override
                    public void accept(Employee employee) {
                        System.out.println(employee);
                    }
                });

        System.out.println("---------------------------------------------------------");


        // lambda function
        loadEmployeesFromDB()
                .forEach(employee -> System.out.println(employee));


        System.out.println("---------------------------------------------------------");

        // using default method reference
        loadEmployeesFromDB()
                .forEach(System.out::println);


        System.out.println("---------------------------------------------------------");

        // using custom method reference
        loadEmployeesFromDB()
                .forEach(MethodReferencesDemo::print);


        System.out.println("---------------------------------------------------------");

        // using custom non-static method reference
        loadEmployeesFromDB()
                .forEach(methodReferencesDemo::nonStaticPrint);


        System.out.println("---------------------------------------------------------");

      /*  StudentDAo.getAllStudents()
                .forEach(System.out::println);*/


        System.out.println("---------------------------------------------------------");

        // anonymous method
        List<StudentDTO> studentsList = StudentDAo.getAllStudents()
                .stream()
                .map(new Function<Student, StudentDTO>() {
                    @Override
                    public StudentDTO apply(Student student) {
                        StudentDTO studentDTO = new StudentDTO();

                        studentDTO.setId(student.getId());
                        studentDTO.setName(student.getName());
                        studentDTO.setGrade(student.getGrade());
                        studentDTO.setScore(student.getScore());

                        return studentDTO;
                    }
                })
                .collect(Collectors.toList());


        System.out.println(studentsList);


        System.out.println("---------------------------------------------------------");


        // using lambda
        List<StudentDTO> studentsList1 = StudentDAo.getAllStudents()
                .stream()
                .map((student) -> {
                    StudentDTO studentDTO = new StudentDTO();

                    studentDTO.setId(student.getId());
                    studentDTO.setName(student.getName());
                    studentDTO.setGrade(student.getGrade());
                    studentDTO.setScore(student.getScore());

                    return studentDTO;
                })
                .collect(Collectors.toList());

        System.out.println(studentsList1);

        System.out.println("---------------------------------------------------------");

        List<StudentDTO> studentsList2 = StudentDAo.getAllStudents()
                .stream()
                .map(student -> StudentMapper.convertStudentToStudentDTO(student))
                .collect(Collectors.toList());

        System.out.println(studentsList2);

        System.out.println("---------------------------------------------------------");

        List<StudentDTO> studentsList3 = StudentDAo.getAllStudents()
                .stream()
                .filter(student -> student.getScore() >= 35)
                .map(StudentMapper::convertStudentToStudentDTO)
                .collect(Collectors.toList());

        System.out.println(studentsList3);

        System.out.println("---------------------------------------------------------");

        List<String> studentsNames = StudentDAo.getAllStudents()
                .stream()
                .map(student -> student.getName())
                .collect(Collectors.toList());

        System.out.println(studentsNames);

        System.out.println("---------------------------------------------------------");

        long promotedStudents = StudentDAo.getAllStudents()
                .stream()
                .filter(student -> student.getScore() >= 35)
                .count();

        System.out.println("Promoted students count -> " + promotedStudents);

        System.out.println("---------------------------------------------------------");

        List<String> studentsNamesMethod = StudentDAo.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println(studentsNamesMethod);


        System.out.println("---------------------------------------------------------");


    }

    public static void print(Employee employee) {
        System.out.println("Custom emp -> " + employee);
    }

    public void nonStaticPrint(Employee employee) {
        System.out.println("not static emp -> " + employee);
    }
}
