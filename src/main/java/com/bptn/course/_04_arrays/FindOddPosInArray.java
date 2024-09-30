package com.bptn.course._04_arrays;

public class FindOddPosInArray {

	public static void main(String[] args) {
		System.out.println("Elements of the given array at odd position: ");
		
		int [] Array1 = {10,20,30,40,50};
		
		/*for (int i = 1; i<Array1.length; i+=2) {
			System.out.println(Array1[i]);
		}
	}

}  */

//Alternatively
     for (int i=0; i<Array1.length;i++) {
    	 if (i % 2 !=0) {
    		 System.out.println(Array1[i]);
    	 }
     }
}
}