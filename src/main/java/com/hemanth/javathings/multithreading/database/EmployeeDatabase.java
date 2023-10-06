package com.hemanth.javathings.multithreading.database;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hemanth.javathings.multithreading.SampleEmployee;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class EmployeeDatabase {

    public static List<SampleEmployee> fetchEmployees() {
        ObjectMapper mapper = new ObjectMapper();

        try {
            return mapper.readValue(new File("employees.json"), new TypeReference<List<SampleEmployee>>() {
            });
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
