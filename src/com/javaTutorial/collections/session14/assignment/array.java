package com.javaTutorial.collections.session14.assignment;


public class Sample {
	
		public static void main(String[] args) {

		      int[] aa = new int[] {45, 1, 23,4,31,0,0,0};
		      int[] bb = new int[] {17, 9,1};
		    
		      System.out.println("aa before concatenation:");
		      for (int i = 0; i < aa.length; i++)
		            System.out.print(aa[i] + " ");
		      
		      System.arraycopy(bb, 0, aa, 5, 3);
		      System.out.print("aa after concatenation: ");
		      for (int i = 0; i < aa.length; i++)
		            System.out.print(aa[i] + " ");
		      int temp;
		      public static int[] sortArray(int[] aa) {
		    	    int[] sortedArray = new int[aa.length];
		    	    int temp;
		    	    for (int i = 0; i < aa.length - 1; i++) {
		    	        if (aa[i] > aa[i + 1]) {
		    	            temp = aa[i];
		    	            aa[i] = aa[i + 1];
		    	            aa[i + 1] = temp;
		    	            sortedArray = aa;

		    	        }
		    	    }
		    	    return sortedArray;
		    	}		   
	}
	
