package array_variation;

public class SumOfTriangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{6,5,4},{1,2,5},{7,9,7}};
		int sumUp=0;
		int sumLow=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++) {
				if(j>=i)
					sumUp+=a[i][j];
				if(i>=j)
					sumLow+=a[i][j];
				
			}
		}
		System.out.println(sumUp);

		System.out.println(sumLow);
}

}
