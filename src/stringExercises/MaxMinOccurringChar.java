package stringExercises;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxMinOccurringChar {

//	public static void main(String[] args) {
//		String str="Grass is greener on the other side";
//		//here a is occurring only once and letter e is appearing 6 times
//		int len=str.length();
//		int count=0, min=0;
//		char ch;
//		String s = null;
//		for(int i=0;i<len;i++)
//		{
//			int maxCount=0, minCount=0;
//			s=Character.toString(str.charAt(i));
//			for(int j=i;j<len;j++)
//			{
//				String s1=Character.toString(str.charAt(j));
//				if(s.equalsIgnoreCase(s1))
//				{
//					maxCount++;
//				}
//				if()
//			}
//			if(count<maxCount)
//			{
//				count=maxCount;
//				
//			}
//			
//		}
//		System.out.println(s+" is appearing "+count+" times");
//		
//	}
	//with help of HashMap
	public static void main(String[] args) {
		String str="Grass is greener on the other sie";
		int len=str.length();
		int count=0;
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		for(int i=0;i<len;i++)
		{
			String s=Character.toString(str.charAt(i));
			if(str.charAt(i)!=' ')
			{
				s=s.toLowerCase();
				if(!(hm.containsKey(s)))
				{
					count=1;
					hm.put(s, count);
				}
				else
				{
					count=hm.get(s);
					count++;
					hm.put(s, count);
				}
			}
		}
		
		int maxValueinMap=Collections.max(hm.values());
		int minValueinMap=Collections.min(hm.values());
		for(Map.Entry m:hm.entrySet())
		{
			if(m.getValue().hashCode()==maxValueinMap)
				System.out.println("Maximum value for key "+m.getKey()+" is appearing "+ m.getValue()+ " times");
			if(m.getValue().hashCode()==minValueinMap)
				System.out.println("Minimum value for key "+m.getKey()+" is appearing "+ m.getValue()+ " times");
		}
	}

}
