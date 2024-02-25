package array_variation;

public class NearestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=17;
		int m=5;
		
	 
		if(n%m==0) {
			System.out.println(n);
		}
		else {
			int diff=1;
			while(true) {
				if((n+diff)%m==0) {
					System.out.println(n+diff);
					break;
				}
				if((n-diff)%m==0) {
					System.out.println(n-diff);
					break;
				}
				diff++;
			}
		}
	}

}
