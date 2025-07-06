package com.principles.hospitalpatientmanagement;

class InPatient extends Patient implements MedicalRecord {
	private int daysAdmitted;
	private double dailyCharge;

	public InPatient(String patientId, String name, int age, String diagnosis, int daysAdmitted, double dailyCharge) {
		super(patientId, name, age, diagnosis);
		this.daysAdmitted = daysAdmitted;
		this.dailyCharge = dailyCharge;
	}

	@Override
	public double calculateBill() {
		return daysAdmitted * dailyCharge;
	}

	@Override
	public void addRecord(String record) {
		addToMedicalHistory(record);
	}

	@Override
	public void viewRecords() {
		System.out.println("Medical History:\n" + getMedicalHistory());
	}
}