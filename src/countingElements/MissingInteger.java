package countingElements;

import java.util.HashSet;

public class MissingInteger {

	public static void main(String[] args) {
		int[] A= { 1, 1, 1, 2 };
		 int k= solution(A); 
		 System.out.println(k);
	}
	public static int solution(int[] A) {
		HashSet<Integer> hs=new HashSet<Integer>();
		int h=1;
		for(int i=0;i<A.length;i++)
			hs.add(A[i]);
		for(int i=1;i<Integer.MAX_VALUE;i++)
		{
			if(!hs.contains(i))
			{
				return i;
			}
		}
		return h;
		
	}

}
