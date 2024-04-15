package streams;

import java.util.ArrayList;

public class ConvertingTheStringsToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Doll");
		list.add("Apple");
		list.add("Cat");
		list.add("Ball");
		list.stream().map(s -> s.toUpperCase()).sorted().forEach(s -> System.out.println(s));;

	}

}
