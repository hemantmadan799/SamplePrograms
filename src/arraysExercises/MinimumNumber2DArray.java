package arraysExercises;

public class MinimumNumber2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java program for finding the minimum number from a 2D Array
		int arr[][]= {{2,4,5}, {3,10,7}, {1,2,9}};
		int min=arr[0][0];
		int mincolumn = 0;
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length;j++)
			{
				if(arr[i][j]<min)
				{
					min=arr[i][j];
					mincolumn=j;
				}
			}
		}
//		System.out.println("minimum number is "+min);
//		System.out.println("min column value is "+mincolumn);
		int k=0;
		int max=0;
		max=arr[k][mincolumn];
		while(k<arr.length)
		{
			if(arr[k][mincolumn]>max)
				max=arr[k][mincolumn];
			k++;
		}
		
		System.out.println(max);
	}

}
