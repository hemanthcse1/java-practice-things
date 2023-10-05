package com.hemanth.javathings.java8features.skipandlimit;


import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class SkipAndLimitDemo {

    public static void main(String[] args) throws IOException {


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        numbers.stream()
                .skip(2)
                .limit(6)
                .forEach(System.out::println);

       /* String filePath = "example.txt";
        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write("Hello......");
        fileWriter.close();*/


        List<String> fileData = Files.readAllLines(Paths.get("example.txt"));

        System.out.println(fileData.size());

        fileData.stream()
                .skip(1)
                .limit(fileData.size()-2)
                .forEach(System.out::println);


    }
}
