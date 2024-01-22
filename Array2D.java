package arrays;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] [] = {{ 32,41,53,75,11},
		              {12,13,33,95,11},
		              {22,16,31,45,10},
		              {23,10,37,45,13},
		              {25,11,30,50,17},};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i] [j] + " ");
			}
			System.out.println();
			}
		
	}

}
