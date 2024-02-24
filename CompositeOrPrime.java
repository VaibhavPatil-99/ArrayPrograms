package array_variation;

public class CompositeOrPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=22;
		
		boolean result = vaibhav(num);
		if(result)
			System.out.println("composite");
		else
			System.out.println("prime");
	}

	private static boolean vaibhav(int num) {
		
	for(int i=2;i<num;i++) {
		if(num%2==0)
			return true;
		
	}
	return false;
	}

}
