package array_variation;

public class SumEvenOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5};
		
		int eSum=0;
		int oSum=0;
		
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				eSum=eSum+a[i];
			}
			else {
				oSum=oSum+a[i];
			}
				
		}
		System.out.println(eSum);
		System.out.println(oSum);

	}

}
