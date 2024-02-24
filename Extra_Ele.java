package array_variation;

public class Extra_Ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,4,6,200,8,9,10,12,100};
		int b[]= {10,4,6,8,2,12};
		
		for(int i=0;i<a.length;i++) {
			boolean result = karan(b,a[i]);
			if(result==false) {
				System.out.println(a[i]);
			}
		}
	}

	private static boolean karan(int[] b, int num) {
		
		for(int i=0;i<b.length;i++) {
			if(b[i]==num) {
				return true;
			}
		}
		return false;
	}

}
