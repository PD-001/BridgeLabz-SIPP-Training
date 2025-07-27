package com.introduction.AIdrivenresumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        // Create resumes
        Resume<SoftwareEngineer> resume1 = new Resume<>(new SoftwareEngineer("Anubhav", 3));
        Resume<DataScientist> resume2 = new Resume<>(new DataScientist("Divanshu", 1));
        Resume<ProductManager> resume3 = new Resume<>(new ProductManager("Prakash", true));

        // Screen individual resumes
        System.out.println("=== Individual Screening ===");
        resume1.screen();
        resume2.screen();
        resume3.screen();

        // Wildcard-based bulk processing
        System.out.println("\n=== Bulk Screening ===");
        List<JobRole> allCandidates = new ArrayList<>();
        allCandidates.add(new SoftwareEngineer("Ayush", 1));
        allCandidates.add(new DataScientist("Utkarsh", 4));
        allCandidates.add(new ProductManager("Manish", false));

        ResumeScreeningPipeline.processResumes(allCandidates);
    }
}
