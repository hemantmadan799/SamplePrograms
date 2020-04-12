package stringExercises;

public class RemoveSpecialChars {

	public static void main(String[] args) {
		String str="#%$hemant#$%Madan";
		String special="!@#$%^&*()_";
		String updatedString = "";
		char activeChar;
		for(int i=0;i<str.length();i++)
		{
			activeChar=str.charAt(i);
			if(!special.contains(Character.toString(activeChar)))
			{
				updatedString=updatedString+Character.toString(activeChar);
			}
		}
		System.out.println(updatedString);

	}

}
