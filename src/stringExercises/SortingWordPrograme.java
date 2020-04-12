package stringExercises;

public class SortingWordPrograme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hemant";
		char[] tempArray=str.toCharArray();
		char ch;
		for (int i = 0; i < tempArray.length; i++) 
		{
			for (int j =i+1; j < tempArray.length; j++) 
			{
				int x,y;
				x=y=0;
				x=tempArray[i];
				y=tempArray[j];
				if(x>y)
				{
					ch=tempArray[i];
					tempArray[i]=tempArray[j];
					tempArray[j]=ch;
				}
			}
		}
		for (int i = 0; i < tempArray.length; i++) {
			System.out.println(tempArray[i]);
		}
	}

}
