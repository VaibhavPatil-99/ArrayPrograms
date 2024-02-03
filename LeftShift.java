package arrays;

public class LeftShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,15,13,4,5,7,2};
		
		int temp = a[0];
		
		for(int i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
			
		}
		a[a.length-1] = temp;
		
		for(int m : a) {
			System.out.print(m + " ");
		}
	}

}
