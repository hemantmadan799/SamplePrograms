package arraysExercises;

public class Rotation {
	
	public static void main(String[] args) {
		
		int[] A= {-1000};
		int K=4;
		int[] k=solution(A, K);
		for(int i=0;i<k.length;i++)
		{
			System.out.println(k[i]);
		}
	}
	
	public static int[] solution(int[] A, int K)
	{
		int j=0;
		while(j<K)
		{
			int temp, temp2;
			temp=temp2=0;
			for(int i=0;i<A.length-1;i++)
			{
				if(i==0)
				{
					temp=A[A.length-1];
					temp2=A[i+1];
					A[i+1]=A[i];
					A[i]=temp;
				}
				else
				{
					temp=temp2;
					temp2=A[i+1];
					A[i+1]=temp;
				}
			}
			j++;
		}
		return A;
	}

}