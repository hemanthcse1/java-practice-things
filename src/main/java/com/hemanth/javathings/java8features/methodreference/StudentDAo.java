package com.hemanth.javathings.java8features.methodreference;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StudentDAo {


    public static List<Student> getAllStudents() {
        return IntStream.range(1, 60)
                .mapToObj(i -> new Student(i, "student" + i, 10, new Random().nextInt(100)))
                .collect(Collectors.toList());
    }
}
