package com.javaTutorial.collections.session14.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareCustomerTest {
	public static void main(String[] args) {
		 
		 	
		 		Customer c1=new Customer("sagar","beeram",25, 5.9,80);
		 		Customer c2=new Customer("tony","stark",55, 5.7,75);
		 		Customer c3=new Customer("peter","parker",22, 5.11,82);
		 		Customer c4=new Customer("bruce","wayne",44, 6.3,85);
		 		Customer c5=new Customer("clark","kent",38, 6.4,94);
		 		Customer c6=new Customer("steve","rogers",153, 6.2,82);
		 		Customer c7=new Customer("jones","kelly",32, 5.5,70);
		 		Customer c8=new Customer("thor","asgard",35, 6.5,120);
		 		Customer c9=new Customer("bruce","banner",45, 5.10,90);
		 		Customer c10=new Customer("natasha","romanoff",32, 5.7,60);
		 		List<Customer> customerList = new ArrayList<>();
		 		
		 		customerList.add(c1);
		 		customerList.add(c2);
		 		customerList.add(c3);
		 		customerList.add(c4);
		 		customerList.add(c5);
		 		customerList.add(c6);
		 		customerList.add(c7);
		 		customerList.add(c8);
		 		customerList.add(c9);
		 		customerList.add(c10);
		 		
		 		
		 		System.out.println("Before Sorting by height...");
		 		for(Customer cs : customerList) {
		 			System.out.println("height: " + cs.getHeight());
		 		}
		 		
		 		Collections.sort(customerList, new CustomerHeightComparator());
		 
		 		System.out.println("---------------------------After Sotring by height...\n");
		 		for(Customer st : customerList) {
		 			System.out.println("Height: " + st.getHeight());
		 		}
		 		
		 	}
}
