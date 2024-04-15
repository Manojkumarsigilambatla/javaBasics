import java.util.ArrayList;
import java.util.HashSet;

public class countofDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //4,5,5,5,6,6,4
		int arr[] = {4,5,5,5,6,6,4};
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			al.add(arr[i]);
		}
		al.sort(null);
		System.out.println(al);
	    HashSet<Integer> hs = new HashSet<Integer>();
	    int k=1;
	    for(Integer i : al)
	    {
	    	if(hs.add(i))
	    	{ 
	    		k=1;
	    	}
	    	else
	    	{
	    		k++;
	    	}
	    	System.out.println(i +"" +k);
	    }
	    
		
	}

}
