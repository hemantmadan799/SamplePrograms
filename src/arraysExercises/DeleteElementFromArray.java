package arraysExercises;

import static org.testng.Assert.expectThrows;

import java.util.Scanner;

public class DeleteElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of array");
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements");
		for (int i = 0; i < size; i++) 
			arr[i]=scan.nextInt();
		System.out.println("Enter the value to delete");
		int val=scan.nextInt();
		int flag=0;
		int loc=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==val)
			{
				flag=1;
				loc=i;
				break;
				
			}
			
		}
		if(flag==1)
		{
		
			for (int k = loc+1; k < size; k++) {
				arr[k-1]=arr[k];
			}
			for (int i = 0; i < arr.length-1; i++) {
				System.out.println(arr[i]);
			}
		}
		else {
			System.out.println("value not found");
		}
	}

}
