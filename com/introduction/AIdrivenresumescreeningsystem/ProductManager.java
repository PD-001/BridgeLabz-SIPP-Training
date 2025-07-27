package com.introduction.AIdrivenresumescreeningsystem;

public class ProductManager extends JobRole {
    private boolean hasMBA;

    public ProductManager(String candidateName, boolean hasMBA) {
        super(candidateName);
        this.hasMBA = hasMBA;
    }

    @Override
    public String getRole() {
        return "Product Manager";
    }

    @Override
    public boolean isEligible() {
        return hasMBA;
    }
}