package timeComplexity;

public class PermMissingElement {
	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,5};
		int num = solution(arr);
		System.out.println(num);
	}

	public static int solution(int[] A) {
		int c=0, sum=0;
		for(int i=0;i<A.length;i++)
			c=c+A[i];
		sum=(A.length +1)*(A.length+2)/2;
		return sum-c;
	}
}
