package stringExercises;

public class CheckPalindrome {

	public static void main(String[] args) {
		
		
	System.out.println(isPalindrome("madam"));
		
		}
	
	public static boolean isPalindrome(String str) {
		int j=str.length();
		int i=0;
//		System.out.println(Character.compare(str.charAt(i), str.charAt(j-1)));
		while(i<j)
		{
			if(Character.compare(str.charAt(i), str.charAt(j-1))==0)
			{
				i++;
				j--;
			}
			else
				return false;
			
		}		
		return true;
		
	}

}
