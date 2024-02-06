package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// selection sort

		int a[] = {78,11,9,22,5,10,99};
		int min=0;
		
		for(int i=0;i<a.length;i++) {
			
			 min=i; 
			 for(int j=i+1;j<a.length;j++) {
				 
				 if(a[j]<a[min]) {
					 min = j;
				 }
			 }
			 int temp = a[i];
			 a[i]=a[min];
			 a[min]=temp;
		}
		for(int i : a) {
			System.out.print(i + " ");
		}
	}

}
