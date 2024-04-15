package logics;

public class Arm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count=0;
        int num =14311;
        int countNum=num;
        int sum=0;
        while(num>0)
        {
        	num = num/10;
        	count++;
        	//System.out.println(num);
        }
        System.out.println(count);
        int temp=0;
        while(countNum>0)
        {
        	temp=countNum%10;
        	sum = sum+getXRoot(temp, count);
        	countNum = countNum/10;
        	
        }
        System.out.println(sum);
        
        
        
	}
	public static int getXRoot(int temp,int count)
	{
		int num = temp;
		while(count>=2)
		{
			temp = temp*num;
			count--;
		}
		System.out.println(temp);
		return temp;
	}

}
