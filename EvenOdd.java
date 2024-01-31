
package arrays;

public class EvenOdd {

	// print 1.Even then odd elements
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,7,9,5,10,12};
		int b[]= new int[a.length];
		int j=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				b[j]=a[i];
				j++;
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				b[j]=a[i];
				j++;
			}
		}
			for(int k:b) {
				System.out.print(k +" ");
			
		}
	}

}
