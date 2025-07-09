package com.linkedlist.test;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

interface ListOperations{
	void insertAtEnd(int data);
	void deleteByValue(int data);
	void display();
}

class SinglyLinkedList implements ListOperations{
	Node head;
	
	public void insertAtEnd(int data) {
		Node newdata=new Node(data);
		if(head==null) {
			head=newdata;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newdata;
		return;
	}
	public void deleteByValue(int data) {
		if(head==null) return;
		if(head.data==data) {
			head=head.next;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			if(temp.next.data==data) {
				temp.next=temp.next.next;
				return;
			}
			temp=temp.next;
		}
		System.out.println("No such data");
		return;
	}
	public void display() {
		if(head==null)return;
		Node temp=head;
		while(temp.next!=null) {
			System.out.print(temp.data+ "->");
			temp=temp.next;
		}
		System.out.print(temp.data);
		System.out.println();
		return;
	}
}

public class Main {
	public static void main(String[] args) {
		kjListOperations list=new SinglyLinkedList();
		
		list.insertAtEnd(5);
		list.insertAtEnd(7);
		list.insertAtEnd(9);
		list.display();
		list.deleteByValue(7);
		list.display();
		
	}
}
