package arraysExercises;

import java.util.Scanner;

public class SplitArrayFromSpecifiedPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={0,1,2,3,4,5,6,7,8,9,10,11,12};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the position");
		int pos=scanner.nextInt();
		int j,k;
		j=k=0;
		int[] arr1=new int[arr.length];
		int[] arr2=new int[arr.length];
		for (int i = 0; i < pos; i++)
			arr1[i]=arr[i];
		
		for (int i = pos; i < arr.length; i++) {
			arr2[j]=arr[i];
			j++;}
		System.out.println("printing first array till "+ pos + " positon");
		for (int i = 0; i < pos; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("printing second array after "+ pos + "positon");
		for (int i = 0; i < j; i++) {
			System.out.println(arr2[i]);
			
		}
	}

}
