package array_variation;

public class TruncatableOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 317;
		
		boolean result = containsZero(num);
		
		if (result==true)
		{
			System.out.println("non truncatable");
		}
		else
		{
			result = truncatablePrime(num);
			if(result == true)
				System.out.println("Truncatable prime");
			else
				System.out.println("not trun prime");
		}
	}

	private static boolean truncatablePrime(int num) {
		
		while(true)
		{
			boolean result = isPrime(num);
			if(result==false)
				return false;
			
			num = cutTheDigit(num);
			if(num==0)
				return true;
		}
	}

	
	private static int cutTheDigit(int num) {
		
		int digitCount = 0;
		int temp=num;
		
		while(temp>0)
		{
			temp = temp/10;
			digitCount++;
		}
		digitCount--;
		
		int div = (int)Math.pow(10, digitCount);
		int rem = num%div;
		return rem;
	}
	
	private static boolean isPrime(int num)
	{
		for(int i=2;i<num;i++)
		{
			if(num%i ==0)
				return false;
		}
		return true;
	}
	
	private static boolean containsZero(int num)
	{
		while(num>0)
		{
			int rem = num%10;
			if(rem==0)
				return true;
			num=num/10;
			
		}
		return false;
	}

}




