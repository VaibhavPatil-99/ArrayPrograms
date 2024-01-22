package arrays;

public class Amax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		// Find max element
		
		int a[] = {3,5,78,9,23,67,55};
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			 if(a[i]>max) {
				 max = a[i];
			 }
		}
		System.out.println("max value : "+max);
	

}
}
