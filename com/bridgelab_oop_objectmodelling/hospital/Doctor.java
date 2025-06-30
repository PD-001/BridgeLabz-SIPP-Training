package com.bridgelab_oop_objectmodelling.hospital;

import java.util.*;

public class Doctor {
    private String name;
    private List<Patient> patientsSeen;

    public Doctor(String name) {
        this.name = name;
        this.patientsSeen = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Communication method
    public void consult(Patient patient) {
        if (!patientsSeen.contains(patient)) {
            patientsSeen.add(patient);
            patient.addDoctor(this); // bidirectional association
        }
        System.out.println("Dr. " + name + " is consulting patient " + patient.getName());
    }

    public void viewPatients() {
        System.out.println("Dr. " + name + " has consulted:");
        for (Patient p : patientsSeen) {
            System.out.println("- " + p.getName());
        }
    }
}
