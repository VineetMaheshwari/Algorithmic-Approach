package Basics;

import java.util.Scanner;

public class LinkedList {
	public Node root;
	public LinkedList() {
		root=null;
	}
	public void create() {
		int n;
		Node temp;
		temp=new Node();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value:");
		n=sc.nextInt();
		temp.setValue(n);
		temp.setNext(null);
		root=temp;
		for(int i=1;i<5;i++) {
			temp=new Node();
			System.out.print("Enter the value:");
			n=sc.nextInt();
			temp.setValue(n);
			temp.setNext(null);
			Node q=root;
			while(q.getNext()!=null) {
				q=q.getNext();
			}
			q.setNext(temp);
			sc.close();
		}
	}
	public void display() {
		Node t=root;
		while(t!=null) {
			System.out.print(t.getValue()+"   ");
			t=t.getNext();
		}
		System.out.println();
	}
	public void reverse() {
		Node p=root,t=null;
		Node q=p.getNext();
		p.setNext(null);
		while(q!=null) {
			t=q;
			q=q.getNext();
			t.setNext(p);
			p=t;
		}
		root=p;
		display();
	}
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.create();
		ll.display();
		ll.reverse();
	}
}
