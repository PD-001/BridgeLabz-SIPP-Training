package com.workshops.student_marks_report;

import java.util.*;

public class StudentMarksReport {
    private Map<String, List<Integer>> studentMarks= new HashMap<>();
    
    public void addMarks(String name, int mark){
        studentMarks.putIfAbsent(name, new ArrayList<>());
        studentMarks.get(name).add(mark);
    }

    public double calculateAverage(String name){
        List<Integer> marks= studentMarks.get(name);

        int totalMarks = 0;

        for(int mark : marks) {
            totalMarks += mark;
        }

        return (double) totalMarks / marks.size();
    }

    public String topPerformingStudent(){
        String topStudent = null;
        int highestAverage = Integer.MIN_VALUE;
        for(String s: studentMarks.keySet()) {
            double average = calculateAverage(s);
            if (average > highestAverage) {
                highestAverage = (int) average;
                topStudent = s;
            }
        }
        return topStudent;
    }
}