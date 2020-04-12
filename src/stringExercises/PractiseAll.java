package stringExercises;

import java.util.Scanner;

public class PractiseAll {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6};
	try {
		System.out.println(arr[44]);
	}
	catch (IndexOutOfBoundsException e) {
		// TODO Auto-generated catch block
		System.out.println("inside index block");
	}catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("inside catch block");
	}
	finally {
		System.out.println("inside finally block");
	}
}
}

//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31