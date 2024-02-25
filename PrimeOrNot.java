package array_variation;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		for(int i=2;i<n;i++) {
			boolean result = praneet(i);
			if(result) {
				System.out.println(i);
			}
		}
		
	}

	private static boolean praneet(int i) {
		
		for(int j=2;j<i;j++) {
			if(i%j==0)
				return false;
		}
		return true;
	}

}
