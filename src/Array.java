import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=10;
		int [] arr = new int[size];
		arr[1]=2;
		System.out.println(arr[1]);
		System.out.println(arr.length);
		ArrayList<String> al = new ArrayList<String>();
		al.add("Manoj");
		al.add("kumar");
		System.out.println(al);
		al.add(0, "sigilambatla");
		System.out.println(al);
		System.out.println(al.remove(2));
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.indexOf("sigilambatla"));
	}

}
