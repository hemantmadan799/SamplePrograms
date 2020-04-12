package stringExercises;

public class LetterOccurrenceWithoutHashMap {

	public static void main(String[] args) {
		String string="Hemant";
		int count[]=new int[256];
		for (int i = 0; i < string.length(); i++)
			count[string.charAt(i)]=count[string.charAt(i)]+1;
		char[] ch=new char[string.length()];
		for (int i = 0; i < ch.length; i++) 
		{
			ch[i]=string.charAt(i);
			int find=0;
			for (int j = 0; j <ch.length; j++) 
			{
				if(string.charAt(i)==ch[j])
					find++;
			}
			if(find==1)
				System.out.println("Number of Occurrence of " + 
		                 string.charAt(i) + " is:" + count[string.charAt(i)]);
		 }	
	
	}

}
