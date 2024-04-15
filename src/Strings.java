
public class Strings {

	static char []  name= {'m','a','n','o','j'};
	static String fname="";
	static String rev="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<name.length;i++)
		{
			fname= fname+name[i];
		}
		System.out.println(fname);
		
		
		for(int i=name.length-1;i>=0;i--)
		{
			rev = rev + name[i];
		}

		System.out.println(rev);
		
		for(int i=0;i<name.length;i++)
		{
			fname = name[i]+fname;
		}
		System.out.println(fname);
	}

}