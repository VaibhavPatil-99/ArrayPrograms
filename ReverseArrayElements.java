
package arrays;

public class ArrayRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,60,70,20,50,90};
		
		int i=0;
		int j=a.length-1;
		int temp;
		
		while(i<j) {
			temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
			
		}
		
//		for(int i=a.length-1;i>=0;i--)
//		{
//			System.out.print(a[i]+" ");
//		}
		
		
		for(int k : a) {
			System.out.print(k+ " " );
		}
	}

}
