package com.bridgelab_oops_part3;
//PatientMain.java
public class PatientMain {
 public static void main(String[] args) {
     // Create patient objects
     Patient p1 = new Patient("Ravi Kumar", 45, "Diabetes", "P001");
     Patient p2 = new Patient("Meena Sharma", 30, "Flu", "P002");

     // Check with instanceof before displaying details
     if (p1 instanceof Patient) {
         p1.displayPatientDetails();
     }

     System.out.println(); // spacing

     if (p2 instanceof Patient) {
         p2.displayPatientDetails();
     }

     System.out.println(); // spacing

     // Display total patients
     System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
 }
}
