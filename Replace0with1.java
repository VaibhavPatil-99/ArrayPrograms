package arrays;

public class Replace0with1 {

	// Program to replace 0 with 1
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {5,0,0,5,4,0,8,4,0,0};
		
		for(int i=0;i<a.length;i++ ) {
			if(a[i]==0)
				a[i]=1;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	

}
}