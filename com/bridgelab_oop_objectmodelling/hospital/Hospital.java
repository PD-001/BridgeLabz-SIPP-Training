package com.bridgelab_oop_objectmodelling.hospital;

import java.util.*;

public class Hospital {
    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.hospitalName = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doc) {
        doctors.add(doc);
    }

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void showDoctors() {
        System.out.println("Doctors at " + hospitalName + ":");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getName());
        }
    }

    public void showPatients() {
        System.out.println("Patients at " + hospitalName + ":");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}
