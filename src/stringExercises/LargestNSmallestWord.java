package stringExercises;

public class LargestNSmallestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="India is the greatest country";
		int largest = 0, smallest;
		int len=str.length();
		int currentLength = 0;
		String currString="";
		String largestString = null, smallestString=null;
		for(int i=0;i<len;i++)
		{
			String s=Character.toString(str.charAt(i));
			if(str.charAt(i)!=' ')
			{
				currentLength++;
				currString=currString+s;
			}
			else
			{
				currentLength=0;
				currString="";
			}
			if(currentLength>largest) 
			{
				largest=currentLength;
				largestString=currString;
			}
			
			
		}
		System.out.println("largest word is "+largest);
		System.out.println("largest word is '"+largestString+"'");
		
		
	}

}
