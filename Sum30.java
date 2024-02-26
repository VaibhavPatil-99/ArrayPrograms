package array_variation;

public class Sum30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,77,10,54,-11,10,10};
		boolean result = gaurav(a);
		System.out.println(result);
	}

	private static boolean gaurav(int[] a) {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==10)
				sum=sum+a[i];
		}
		if(sum==30)
			return true;
		return false;
	}

}
