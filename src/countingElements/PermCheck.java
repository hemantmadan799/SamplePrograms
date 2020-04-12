package countingElements;

public class PermCheck {

	public static void main(String[] args) {
		int[] arr = { 1,2,1};
		int num = solution(arr);
		System.out.println(num);
	}

	public static int solution(int[] A) {
		int actualSum=0, ExpectedSum, k;
		for(int i=0;i<A.length;i++)
			actualSum=actualSum+A[i];
		ExpectedSum=(A.length)*(A.length+1)/2;
		if (actualSum==ExpectedSum)
			return 1;
		else
			return 0;

	}

}
