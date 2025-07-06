package com.principles.hospitalpatientmanagement;

abstract class Patient {
	private String patientId;
	private String name;
	private int age;
	private String diagnosis;
	private StringBuilder medicalHistory;

	public Patient(String patientId, String name, int age, String diagnosis) {
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.diagnosis = diagnosis;
		this.medicalHistory = new StringBuilder();
	}

	// Encapsulation: Getters (No direct setters for sensitive data)
	public String getPatientId() {
		return patientId;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	protected String getDiagnosis() {
		return diagnosis;
	}

	protected void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	protected void addToMedicalHistory(String record) {
		medicalHistory.append(record).append("\n");
	}

	protected String getMedicalHistory() {
		return medicalHistory.toString();
	}

	// Concrete Method
	public void getPatientDetails() {
		System.out.println("Patient ID: " + patientId);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Diagnosis: " + diagnosis);
	}

	// Abstract Method
	public abstract double calculateBill();
}