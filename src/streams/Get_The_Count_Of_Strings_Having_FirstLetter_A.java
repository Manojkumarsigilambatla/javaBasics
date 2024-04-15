package streams;

import java.util.ArrayList;

public class Get_The_Count_Of_Strings_Having_FirstLetter_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		list.add("Manoj");
		list.add("ganesh");
		list.add("yadagiri");
		list.add("padma");
		list.add("Manoj Kumar");
		
		System.out.println(withoutStream(list));
		System.out.println(withStream(list));
	}
	
	public static int withoutStream(ArrayList<String> list)
	{
		int count=0;
		for(int i=0;i<list.size();i++)
		{
			String str=list.get(i);
			if(str.startsWith("M"))
			{
				count++;
			}
		}
		return count;
	}
	public static int withStream(ArrayList<String> list)
	{ 
		int count =(int) list.stream().filter(str -> str.startsWith("M")).count();
		return count;
	}

}
