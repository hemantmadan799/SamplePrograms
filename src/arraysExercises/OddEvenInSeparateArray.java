package arraysExercises;

public class OddEvenInSeparateArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int[] even=new int[arr.length];
		int[] odd=new int[arr.length];
		int j, k;
		j=k=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]%2==0)
			{
				even[j]=arr[i];
				j++;
			}
			else {
				odd[k]=arr[i];
				k++;
			}
		}
		System.out.println("printing even array");
		for (int i = 0; i < j; i++) 
		{
			System.out.println(even[i]);
		}
//		printing odd array
		System.out.println("printing odd array");
				for (int i = 0; i < k; i++) 
				{
					System.out.println(odd[i]);
				}
	}

}
