package arrays;

public class BubbleSort {

	public static void main(String[] args) {
	
		// Bubble sort or Basic sort

		int a[] = {8,6,5,3,2};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for(int k : a) {
			System.out.print(k + " ");
		
		}
	}

}
