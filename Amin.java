package arrays;

public class Amin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int a[] = {3,5,78,9,23,67,55};
		
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			 if(a[i]<min) {
				 min = a[i];
			 }
		}
		System.out.println("min value : "+min);
	

}
}
