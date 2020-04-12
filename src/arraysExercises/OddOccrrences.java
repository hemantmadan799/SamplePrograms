package arraysExercises;

public class OddOccrrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 5, 4, 5, 4, 2, 7 };
		int j = solution(arr);
		System.out.println(j);
	}

	public static int solution(int[] A) {
		int count, k;
		count = k = 0;
		for (int i = 0; i < A.length; i++) {
			k = A[i];
			for (int j = 0; j < A.length; j++) {
				if (A[i] == A[j]) {
					count++;
				}
			}
			if (count % 2 != 0) {
				break;
			}
		}
		return k;

	}

}
