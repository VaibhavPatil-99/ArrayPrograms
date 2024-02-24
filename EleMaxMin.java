package array_variation;

import java.util.Arrays;

public class EleMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int a[] = {7,1,2,3,4,5,6};
		
		Arrays.sort(a);
		
		int b[]=new int[a.length];
		int index=0;
		int i=0;
		int j=a.length-1;
		
		while(true) {
			b[index++]=a[j];
			j--;
			if(i>j)
				break;
			
			b[index++]=a[i];
			i++;
			if(i>j)
				break;
		}
		
		for(int k:b) {
			System.out.print(k+ " ");
		}
		}

}
