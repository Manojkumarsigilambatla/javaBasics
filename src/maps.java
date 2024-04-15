import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "Sigilambatla");
		hm.put(1, "Manoj");
		hm.put(2, "Kumar");
		
		System.out.println(hm.get(0));
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		
		//printing the keys using Keyset() method of maps.
		//keyset() method with returns the set of keys.
		Set<Integer> set = hm.keySet();
		Iterator<Integer> it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//entryset().
		
		Set<?> entrySet=hm.entrySet();
		
		Iterator<?> itt=entrySet.iterator();
		
		while(itt.hasNext())
		{
			Map.Entry<Integer,String> me=(Map.Entry<Integer, String>) itt.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
		
		//Values
		
		Collection<String> c=hm.values();
		Iterator<String> it1 =c.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	
		
	}

}
