package arraysExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {
//sorting the array and then taking the second smallest number, expected output is 2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr= {2,3,1,66,22,55,25};
//		int size=arr.length;
//		int max=0;
//		for(int i=0;i<size;i++)
//		{
//			for(int j=i+1;j<size;j++)
//			{
//				if(arr[i]>arr[j])
//				{
//					max=arr[i];
//					arr[i]=arr[j];
//					arr[j]=max;
//				}
//			}
//		}
//		System.out.println("second smallest number is "+arr[1]);
		
		Integer[] arr= {2,3,1,66,22,55,25};
		List<Integer> lst=Arrays.asList(arr);
		Collections.sort(lst);
		System.out.println("Second smallest number is "+lst.get(1));
		
	}

}
