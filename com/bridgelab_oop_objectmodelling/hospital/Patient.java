package com.bridgelab_oop_objectmodelling.hospital;

import java.util.*;

public class Patient {
    private String name;
    private List<Doctor> consultedDoctors;

    public Patient(String name) {
        this.name = name;
        this.consultedDoctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!consultedDoctors.contains(doctor)) {
            consultedDoctors.add(doctor);
        }
    }

    public void viewConsultedDoctors() {
        System.out.println("Patient: " + name + " has consulted:");
        for (Doctor d : consultedDoctors) {
            System.out.println("- Dr. " + d.getName());
        }
    }
}
