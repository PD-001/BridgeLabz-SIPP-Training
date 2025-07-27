package com.introduction.AIdrivenresumescreeningsystem;

public class DataScientist extends JobRole {
    private int projectsCompleted;

    public DataScientist(String candidateName, int projectsCompleted) {
        super(candidateName);
        this.projectsCompleted = projectsCompleted;
    }

    @Override
    public String getRole() {
        return "Data Scientist";
    }

    @Override
    public boolean isEligible() {
        return projectsCompleted >= 3;
    }
}