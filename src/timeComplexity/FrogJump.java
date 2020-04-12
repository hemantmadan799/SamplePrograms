package timeComplexity;

public class FrogJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X = 10, Y = 180, D = 30;
		int jump = solution(X, Y, D);
		System.out.println(jump);
	}

	/*
	 * X = 10 Y = 100 D = 30 the function should return 3, because the frog will be
	 * positioned as follows:
	 * 
	 * after the first jump, at position 10 + 30 = 40 after the second jump, at
	 * position 10 + 30 + 30 = 70 after the third jump, at position 10 + 30 + 30 +
	 * 30 = 100
	 */
	public static int solution(int X, int Y, int D) {
		if((Y-X)%D!=0)
			return (Y-X)/D+1;
		else
			return ((Y-X)/D);

	}
}
