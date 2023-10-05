package com.hemanth.javathings.java8features.methodreference;

public class StudentMapper {


    public static StudentDTO convertStudentToStudentDTO(Student student) {
        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setId(student.getId());
        studentDTO.setName(student.getName());
        studentDTO.setGrade(student.getGrade());
        studentDTO.setScore(student.getScore());

        return studentDTO;
    }
}
