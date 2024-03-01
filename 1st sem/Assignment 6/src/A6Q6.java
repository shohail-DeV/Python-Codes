
public class A6Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1 , cnt = 0;
		for (i =2 ;true ;i++ )
		{
			boolean palli = isPalindrome(i);
			if(palli==true)
			{
				boolean prime = isPrime(i);
				if(prime == true)
				{
					System.out.print(i+" ");
					cnt = cnt +1;
					if(cnt%10==0)
						System.out.println();
					
				}
			}
			if (cnt==100)
				break;
		}

	}
	public static boolean isPalindrome(int x)
	{
		int y=x,sum = 0;
		while(y>0)
		{
			sum = sum*10 +(y%10);
			y  = y/10; 
		}
		if(sum == x)
			return true;
		else 
			return false;
		
					
	}

	}


