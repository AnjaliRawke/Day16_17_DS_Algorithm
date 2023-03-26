package com.bridgelabz.DataStructureProblems.OrderedLinkedList;

	public class SortedLinkedList <T extends Comparable<T>> {
		Node<T> head;
		Node<T> tail;

		public void add(T data) {
			Node<T> newNode = new Node<>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}

		public void search(T search) {
			Node<T> temp = head;
			boolean flag = false;
			while (temp != null) {
				if (temp.data == search) {
					flag = true;
//                System.out.println("data deleted successfully");
					deleteanyelement(search);
				}
				temp = temp.next;
			}
			if (!flag) {
				add(search);
				System.out.println("data added successfully");
			}
		}

		public void deleteanyelement(T delete) {
			Node<T> temp = head;
			Node<T> temp2 = head;
			Node<T> temp3 = head;
			int count = 0;
			while (temp != null & temp2 != null & temp3 != null) {
				count++;
				if (count > 2) {
					temp3 = temp3.next;
				}
				if (temp.data == delete) {
					temp2 = temp2.next;
					temp3.next = temp2;
					System.out.println("Data deleted successfully!!");
				}
				temp = temp.next;
				temp2 = temp2.next;
			}
		}

		public void sort() {
			Node<T> temp1 = head;
			Node<T> temp2 = head;
			T temp3;

			if (head != null) {
				while (temp1 != null) {
					temp2 = temp1.next;
					while (temp2 != null) {
						if ((temp1.data.compareTo(temp2.data)) > 0) {
							temp3 = temp1.data;
							temp1.data = temp2.data;
							temp2.data = temp3;
						}
						temp2 = temp2.next;
					}
					temp1 = temp1.next;
				}
			}
		}

		public void display() {
			Node<T> temp = head;
			while (temp != null) {
				System.out.print(temp.data + "-> ");
				temp = temp.next;
			}
		}
	}
