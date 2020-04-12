package iterations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println(solution(scan.nextInt()));
		System.out.println(solution(scan.nextInt()));
	}

	public static int solution(int N) {
		ArrayList array = convertToBinary(N);
		int count = 0;
		int gap = 0;
		for (int i=0;i<array.size();i++)
		{
			int k=(int) array.get(i);
			
		    if (k ==0)
		    {
		        count++;
		    }
		    else
		    {
		        if (count>gap)
		        {
		            if (i == array.size() - 1 || k != 0)
		            {
		                gap = count;
		            }
		        }
		        count = 0;
		    }
		}
		return gap;
	/*	int count = 0;
		int maxZero=0;
		int var=0;
		//[1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1]
		for (int i = 0; i < array.size(); i++) 
		{
			int k=(int) array.get(i);
			if(k==0&&i!=array.size()-1)
			{
				maxZero++;
				count=maxZero;
			}
			else if(k==1) 
			    {
					if(i==array.size()-1)
				    	{
						   if(var>maxZero)
							   count=var;
						   else
							   count=maxZero;  
		            	}
					else
					{
						var=maxZero;
						maxZero=0;
					}
		         }
				
				
		}
		return count;
*/	
		}

	public static ArrayList convertToBinary(int b) {
		// 33
		ArrayList<Integer> ar = new ArrayList<Integer>(2);
		ArrayList<Integer> revar = new ArrayList<Integer>(2);
		while (b > 0) {
			int rem = b % 2;
			ar.add(rem);
			b = b / 2;
		}
		for (int i = ar.size() - 1; i >= 0; i--)
			revar.add(ar.get(i));
		return revar;
	}

}
