package array_variation;

public class SumUntilSingleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=98;
		
		while(num>9) {
			num = abhi(num);
		}
		System.out.println(num);
	}

	private static int abhi(int num) {
		
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			num =num/10;
		}
		return sum;
	}

}
