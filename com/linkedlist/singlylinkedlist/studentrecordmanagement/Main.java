package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class Main {
	public static void main(String[] args) {
		StudentRecordManagement srm = new StudentRecordManagement();

		// Sample Operations
		srm.addAtEnd(101, "Divanshu", 21, 'A');
		srm.addAtBeginning(102, "Anubhav", 21, 'B');
		srm.addAtEnd(103, "Prakash", 22, 'C');
		srm.addAtPosition(2, 104, "Ayush", 21, 'B');

		srm.displayAll();

		srm.searchByRollNumber(104);

		srm.updateGrade(103, 'A');
		srm.displayAll();

		srm.deleteByRollNumber(102);
		srm.displayAll();
	}
}