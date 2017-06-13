package com.javaTutorial.collections.session14.assignment;

import java.util.Calendar;

public class CustomerAgeComparator {
	

	public compareTo(dob){
	Calendar cal = Calendar.getInstance();
    int currentYear = cal.getDate().getYear();
    int age = currentYear - this.dob.geyYear();
    return age;
}
	public int compare(Object o1, Object o2) {
		 
 		Customer customer1 = (Customer) o1;
 		Customer customer2 = (Customer) o2;
 		
 		if (customer1.getAge() > customer2.getAge()) {
 			return 1;
 		} else if(customer1.getAge() < customer2.getAge()) {
 			return -1;
 		} else {
 			return 0;
 		}
 		
	}}