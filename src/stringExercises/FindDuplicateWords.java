package stringExercises;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FindDuplicateWords {
//how to find duplicate words in a string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I Love India India is great country This country has many cultures is It has got a lot of many food varieties";
		//expected output India, country, has, many
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		String[] arr=str.split(" ");
		int count=0;
		for(String s:arr)
		{
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
		for(Map.Entry m:hm.entrySet())
		{
			if(m.getValue().hashCode()>1)
			{
				System.out.println(m.getKey());
			}
		}
		
	}

}
