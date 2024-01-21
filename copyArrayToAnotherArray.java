package arrays;

// Copy one array into the other

public class Acopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int a[] = {3,5,7,8,9};
		int b[]	= new int[a.length];
		
		for(int i=0;i<b.length;i++) {
			b[i] = a[i];
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}

}
}
