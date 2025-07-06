package com.principles.hospitalpatientmanagement;

public class Main {

    public static void main(String[] args) {
        Patient[] patients = {
                new InPatient("P001", "Alice", 30, "Appendicitis", 5, 2000),
                new OutPatient("P002", "Bob", 45, "Diabetes", 500)
        };

        for (Patient patient : patients) {
            patient.getPatientDetails();
            double bill = patient.calculateBill();
            System.out.println("Bill Amount: ₹" + bill);

            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                record.addRecord("Routine checkup done.");
                record.addRecord("Prescribed medications updated.");
                record.viewRecords();
            }

            System.out.println("-----------------------------------------------");
        }
    }
}
