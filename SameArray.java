package arrays;

public class SameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,4,5};
		
		if(a.length==b.length) {
			
			int count=0;
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					count++;
					 System.out.println("not same...");
					 break;
				}
			}
			if(count==0) {
				System.out.println("Same array...");
			}
		}
		else {
			System.out.println("not same");
			}
	}

}
