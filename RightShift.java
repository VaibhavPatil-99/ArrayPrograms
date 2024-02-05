package arrays;

public class RightShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,10,12,7,9,5};
		int temp = a[a.length-1];
		
		for(int i=a.length-1;i>0;i--) {
			a[i] = a[i-1];
		}
		a[0]= temp;
		for(int j : a) {
			System.out.print(j + " ");
		}
	}

}
