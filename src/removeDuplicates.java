import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer [] arr = {3,2,2,7,5,1,2,2};
		
		List<Integer> al =Arrays.asList(arr);
		System.out.println(removingDuplicateUsingSet(al));
		System.out.println(removingDuplicateUsingStreams(al));
	}
	public static Set<Integer> removingDuplicateUsingSet(List<Integer> list)
	{
		Set<Integer> set = new HashSet<Integer>();
		for(Integer i : list)
		{
			set.add(i);
		}
		
		return set;
	}
	
	public static Set<Integer> removingDuplicateUsingStreams(List<Integer> list)
	{
		
		return list.stream().distinct().collect(Collectors.toSet());
	}

}
