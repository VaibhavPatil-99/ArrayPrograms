package array_variation;

import java.util.Arrays;

public class RightShift0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,0,4,3,0,5,0};
		int b[]= new int[a.length];
		
		int indexStart=0;
		int indexEnd = b.length-1;
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=0) {
				b[indexStart++]=a[i];
				
			}
			else {
				b[indexEnd--]=a[i];
			
			}
			
		}
		System.out.println(Arrays.toString(b));
	}

}
