package arraysExercises;

public class GreaterThanOther {
	
	public static void main(String[] args) {
		int[] arr= {50,12,13,2,1};
		int len=arr.length;
		for(int i=0;i<len-1;i++)
		{
			int count = 0;
			int k=arr[i];
			for(int j=i+1;j<len;j++)
			{
				if(k>arr[j]) {
					count++;
				}
				else
					break;
			}
			if(count==len-i-1)
			 System.out.println(k);
		}
	}

}
