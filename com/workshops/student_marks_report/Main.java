package com.workshops.student_marks_report;

public class Main {
    public static void main(String[] args) {
        StudentMarksReport newReport= new StudentMarksReport();

        newReport.addMarks("Prakash", 85);
        newReport.addMarks("Prakash", 90);

        newReport.addMarks("Divanshu",95);
        newReport.addMarks("Divanshu", 85);
        System.out.println("Top performing student:"+ newReport.topPerformingStudent());
    }
}
