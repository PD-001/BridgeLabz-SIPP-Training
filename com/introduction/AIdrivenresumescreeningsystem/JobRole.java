package com.introduction.AIdrivenresumescreeningsystem;

abstract class JobRole {
    private String candidateName;

    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public abstract String getRole();
    public abstract boolean isEligible();
}