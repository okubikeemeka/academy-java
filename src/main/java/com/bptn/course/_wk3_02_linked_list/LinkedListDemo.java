package com.bptn.course._wk3_02_linked_list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		// Better to use when we need to manipulate data frequently
		// Create
		LinkedList<String> myList = new LinkedList<>();

		// Insert
		myList.add("Test1");
		myList.add("Test2");
		myList.add("Test1");
		myList.addFirst("Test0");
		myList.addLast("Test10");
		myList.add(2, "Test4");

		// Read
		// System.out.println(myList);
		// Iterator<String> iterator = myList.iterator();
		// while (iterator.hasNext()) {
		// System.out.println(iterator.next());
		// }

		// System.out.println(myList.get(1));
		// System.out.println(myList.element());

		// Update
		myList.set(0, "Test100");

		// Delete
		System.out.println(myList);
		// myList.remove();
		// myList.remove(2);
		myList.removeFirstOccurrence("Test1");
		System.out.println(myList);
	}

}
