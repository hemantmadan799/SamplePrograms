package stringExercises;

import java.util.Arrays;

public class WhiteSpaces {
	public static void main(String[] args) {
		String string=" He is going to school ";
		String expectedString="";
		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i)!=' ')
			{
				expectedString=expectedString+string.charAt(i);
			}
		}
		System.out.println(expectedString);
	} 

}
