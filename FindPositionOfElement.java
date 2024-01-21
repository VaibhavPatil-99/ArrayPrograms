package arrays;

public class A3 {

	public static void main(String[] args) {
		
		
		// Find position of element
		
		int a[]= {12,34,22,67,54,89,23};
		int element=89;
		int count=0;
		 
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==element) {
				count++;
				System.out.println(element+ " is present at index "+i);
			}
		}
		if(count==0) {
			System.out.println("Not found");
		}
	}

}
