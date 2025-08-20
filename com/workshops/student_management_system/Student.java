package com.workshops.student_management_system;

import java.util.*;

public class Student {
    int id;
    String name;
    int age;
    Set<String> subjects;
    HashMap <String, Integer> grades;

    public Student(int id, String name, int age, Set<String> subjects) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.subjects = new HashSet<>(subjects);
        this.grades = new HashMap<>(grades);
    }
}
