package com.introduction.AIdrivenresumescreeningsystem;

import java.util.List;

public class ResumeScreeningPipeline {
    public static void processResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Candidate: " + role.getCandidateName() +
                    " | Role: " + role.getRole() +
                    " | Status: " + (role.isEligible() ? "Eligible" : "Rejected"));
        }
    }
}