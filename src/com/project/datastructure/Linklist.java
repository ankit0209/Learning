package com.project.datastructure;

public class Linklist {

	Node head;

	class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public void add(int data) {

		Node n1 = new Node(data);
		if (head != null) {
			n1.next = head;
			head = n1;
		} else {
			head = n1;
		}

	}
	
	public void addLast(int data) {
		
		Node n1 = new Node(data);
		
		if(head==null) {
			head=n1;
		}
		else {
			while(head.next!=null) {
				head=head.next;
			}
			head.next=n1;
		}
	}
	
	public void print() {
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
	
	public static void main(String[] args) {
		
		Linklist l1 = new Linklist();
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		
		l1.print();
		System.out.println("new list");
		Linklist l2 = new Linklist();
		
		l2.addLast(2);
		l2.addLast(3);
		l2.addLast(4);
		l2.addLast(5);
	}
}
