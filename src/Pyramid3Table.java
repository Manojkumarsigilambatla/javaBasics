
public class Pyramid3Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 3
		// 6 9
		// 12 15 18
		int num =3;
		int k=0;
		for(int i=1;i<=3;i++)
		{
			
			for(int j=1 ; j<=i ;j++)
			{
				k++;
				
				System.out.print(3*k+" " );
				if(k==10)
				{
					break;
				}
				
			}
			System.out.println();
			
		}

	}

}
