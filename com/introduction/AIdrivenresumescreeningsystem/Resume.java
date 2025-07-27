package com.introduction.AIdrivenresumescreeningsystem;

public class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }

    public void screen() {
        System.out.println("Screening resume for " + jobRole.getCandidateName() +
                " (" + jobRole.getRole() + ") - " +
                (jobRole.isEligible() ? "Eligible" : "Not Eligible"));
    }
}