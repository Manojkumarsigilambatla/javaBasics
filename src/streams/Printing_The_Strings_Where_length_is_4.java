package streams;

import java.util.ArrayList;

public class Printing_The_Strings_Where_length_is_4 {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			ArrayList<String> list = new ArrayList<String>();
			list.add("Manoj");
			list.add("ganesh");
			list.add("yadagiri");
			list.add("padma");
			list.add("Manoj Kumar");
			
			
			withStream(list);
		}
		
		public static void withStream(ArrayList<String> list)
		{ 
			list.stream().filter(str -> str.length()>=4).forEach(str->System.out.println(str));
		}

	
}
