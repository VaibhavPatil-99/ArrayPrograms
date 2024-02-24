package array_variation;

public class CheckPalindromePrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1;
		int b=100;
		int sum = 0;
		
		for(int i=a;i<=b;i++) {
			boolean palindrome = isPalindrome(i);
			if(palindrome==true) {
				boolean prime = isprime(i);
					if(prime==true) {
					sum = sum+i;
				}
			}
		}
		System.out.println(sum);
	}

	private static boolean isprime(int num) {
		if(num==1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
			return true;
			
		
	}

	private static boolean isPalindrome(int num) {
		
		int temp=num;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;
			sum=sum*10+rem;
			temp=temp/10;
		}
			if(num==sum) {
				return true;
			}
		
			return false;
		
	}

}
