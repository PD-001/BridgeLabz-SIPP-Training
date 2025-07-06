package com.principles.hospitalpatientmanagement;

class OutPatient extends Patient implements MedicalRecord {
	private double consultationFee;

	public OutPatient(String patientId, String name, int age, String diagnosis, double consultationFee) {
		super(patientId, name, age, diagnosis);
		this.consultationFee = consultationFee;
	}

	@Override
	public double calculateBill() {
		return consultationFee;
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