package com.bridgelab_oop_objectmodelling.hospital;

public class HospitalTest {
    public static void main(String[] args) {
        Hospital apollo = new Hospital("Apollo Hospital");

        Doctor d1 = new Doctor("Sharma");
        Doctor d2 = new Doctor("Verma");

        Patient p1 = new Patient("Ravi");
        Patient p2 = new Patient("Neha");

        // Register doctors and patients in hospital
        apollo.addDoctor(d1);
        apollo.addDoctor(d2);
        apollo.addPatient(p1);
        apollo.addPatient(p2);

        // Consultations (communication + association)
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        // Display consultations
        d1.viewPatients();
        d2.viewPatients();
        p1.viewConsultedDoctors();
        p2.viewConsultedDoctors();

        // Show hospital records
        apollo.showDoctors();
        apollo.showPatients();
    }
}