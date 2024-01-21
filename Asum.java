package arrays;
// basic array program
public class Asum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int [5];
		
		a[0] = 67;
		a[1]=55;
		a[2]=60;
		a[3]=85;
		a[4]=5;
	
		for(int i=0;i<=4;i++) {
			System.out.println(a[i]);
		}
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
		System.out.println("sum is : "+sum);
	}

}
