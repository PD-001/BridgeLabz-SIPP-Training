package com.introduction.AIdrivenresumescreeningsystem;

public class SoftwareEngineer extends JobRole {
    private int yearsOfExperience;

    public SoftwareEngineer(String candidateName, int yearsOfExperience) {
        super(candidateName);
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String getRole() {
        return "Software Engineer";
    }

    @Override
    public boolean isEligible() {
        return yearsOfExperience >= 2;
    }
}