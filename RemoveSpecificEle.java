
package arrays;

public class RemoveSpecificEle {

	// Remove element from the array
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,5,9,4};
		int element = 4;
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==element)
				count++;
		}
		
		int b[] = new int[a.length-count];
		int index=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=element)
			{
				b[index++]=a[i];
			}
		}
		for(int i : b) {
			System.out.print(i + " ");
		}
		
	}

}
