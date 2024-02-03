package arrays;

public class LeastSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]	= {3,7,90,20,5,50,40};
		int k=3;
		int min = Integer.MAX_VALUE;
		int index = 0;
		
		for(int i=0;i<=a.length-k;i++)
		{
			int sum = 0;
			for(int j=i;j<i+k;j++)
			{
				sum = sum + a[j];
				
			}
			if(sum < min) {
				min = sum;
				index = i;
			}
		}
		
		System.out.println(min / k);
		System.out.println(index);
				}

}
