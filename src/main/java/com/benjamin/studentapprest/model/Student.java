package com.benjamin.studentapprest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Student {
    private int studentId;
    private String studentNames;
    private String studentAddress;
    private int studentAge;
}
