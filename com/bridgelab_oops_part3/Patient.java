package com.bridgelab_oops_part3;
//Patient.java
public class Patient {
 // Static variable shared among all patients
 static String hospitalName = "LifeCare Multispeciality Hospital";
 private static int totalPatients = 0;

 // Instance variables
 private String name;
 private int age;
 private String ailment;
 private final String patientID; // final ensures unique and immutable ID

 // Constructor using 'this'
 public Patient(String name, int age, String ailment, String patientID) {
     this.name = name;
     this.age = age;
     this.ailment = ailment;
     this.patientID = patientID;
     totalPatients++;
 }

 // Static method to get total number of patients
 public static int getTotalPatients() {
     return totalPatients;
 }

 // Method to display patient details
 public void displayPatientDetails() {
     System.out.println("Hospital Name : " + hospitalName);
     System.out.println("Patient ID    : " + patientID);
     System.out.println("Name          : " + name);
     System.out.println("Age           : " + age);
     System.out.println("Ailment       : " + ailment);
 }
}
