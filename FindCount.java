package arrays;

public class FindCount {

	// find the count of odd even pos+ neg- numbers
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {11,22,33,44,55,-66,77,88,99};
		int ecount=0;
		int ocount=0;
		int pcount=0;
		int ncount=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				ecount++;
			}
			else {
				ocount++;
			}
			 if(a[i]>0) {
				pcount++;
			}
			 else {
				 ncount++;
			 }
		}
		System.out.println("Even numbers : "+ecount);
		System.out.println("odd numbers : "+ocount);
		System.out.println("positive numbers : "+pcount);
		System.out.println("negative numbers : "+ncount);
				}

}
