package arraysExercises;

import java.util.Scanner;

public class AddElementArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the size of array");
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int arr[]=new int[size+1];
		System.out.println("Enter elements");
		for (int i = 0; i < size; i++) 
			arr[i]=scan.nextInt();
		System.out.println("Enter the index value");
		int index=scan.nextInt();
		System.out.println("Enter the value to enter");
		int val=scan.nextInt();
		for (int k = index+1; k <=size ; k++) 
			arr[k]=arr[k+1];
		arr[index]=val;
		//printing the array
		for (int i = 0; i < size+1; i++) {
			System.out.println(arr[i]);
		}	
	}

		
	}


