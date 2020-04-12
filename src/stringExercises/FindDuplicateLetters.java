package stringExercises;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FindDuplicateLetters {
//how to find duplicate letters in a string
	public static void main(String[] args) {
		
		String str="abcaefhgabacgh";
		String expString="";
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				String s=Character.toString(str.charAt(i));
				if(str.charAt(i)==str.charAt(j)&&(!(expString.contains(s))))
				{
					expString=expString+s;
					break;
				}
			}
		}
		System.out.println(expString);
		
	}

}
