package stringExercises;

import java.util.HashSet;

public class RemoveDuplicateLetters {
// removing duplicate letters from a string using HashSet
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expectedString="";
		String str="abcabefghiaf hkeabcl";
		//expected output= abcefghi
		HashSet<Character> hs=new HashSet<Character>();
		for(int i=0;i<str.length();i++)
			hs.add(str.charAt(i));
		for(char c:hs)
			expectedString=expectedString+Character.toString(c);
		System.out.print(expectedString);
	}
	
////removing duplicate letters from a string without using HashSet
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String expectedString="";
//		char ch;
//		String str="abcabefghiafabcnnm";
//		for(int i=0;i<str.length();i++)
//			{
//				if(!(expectedString.contains(Character.toString(str.charAt(i)))))
//				{
//					expectedString=expectedString+Character.toString(str.charAt(i));
//				}
//			}
//		System.out.println(expectedString);
//	}

}
