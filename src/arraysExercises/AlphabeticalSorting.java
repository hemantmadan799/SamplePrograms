package arraysExercises;
import java.util.Scanner;
public class AlphabeticalSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=scan.nextInt();//5
		int originalArray[]=new int[size];
		for (int i = 0; i <size; i++) {
			originalArray[i]=scan.nextInt();
		}
		System.out.println("Enter the Index to split");
		int index=scan.nextInt();//2
		int arr1[]=new int[index+1];
		int arr2[]=new int[size-index-1];
		for(int k=0;k<=index;k++)
		{		
				arr1[k]=originalArray[k];
		}
		for(int i=0;i<arr2.length;i++)
		{		
				arr2[i]=originalArray[index+1];
				index++;
		}
		System.out.println("Values for Arr1 are::");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("Values for Arr2 are::");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
