package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		/*
		 * List: fifo allows duplicates syntax : interface<generic type> listname=new
		 * implementation class<generic type>();
		 * 
		 * should not use primitive datatypes
		 */
		// add items in the list

		List<String> learners = new ArrayList<String>();
		List<String> trainer = new ArrayList<String>();
		List<String> names = new ArrayList<String>(Arrays.asList("Shri","Aksh","Shreyas"));

		trainer.add("Saranya");
		System.out.println(trainer);
		System.out.println(names);

		learners.add("Shruthi");
		learners.add("Eshwar");
		learners.add("Dyuthi");
		System.out.println(learners); // [Shruthi, Eshwar, Dyuthi]
		learners.add(3, "Dyuthi2");
		learners.add(2, "Eshwar2");
		System.out.println(learners); // [Shruthi, Eshwar, Eshwar2, Dyuthi, Dyuthi2]

		// get() method is present in the List interface
		for (int i = 0; i < learners.size(); i++) {
			System.out.println(learners.get(i));

		}

		// find the size of a list

		int size = learners.size();
		System.out.println(size); // 5 //size starts from 1 not 0
		System.out.println(learners.get(size - 1)); // Dyuthi2

		// to retrieve a value from list
		String persinNo1 = learners.get(1);
		System.out.println(persinNo1); // Eshwar

		// remove any item from list
		learners.remove(3); // [Shruthi (0), Eshwar (1), Eshwar2 (2), Dyuthi (3), Dyuthi2 (4)]
		System.out.println(learners); // [Shruthi, Eshwar, Eshwar2, Dyuthi2]
		boolean remove = learners.remove("Eshwar2");
		System.out.println(remove); // true

		// Add all list together
		trainer.addAll(learners);
		System.out.println(trainer); // [Saranya, Shruthi, Eshwar, Dyuthi2]

		// to clear the entire list
		/*
		 * learners.clear(); System.out.println(learners); //[]
		 * 
		 */
	}

}
