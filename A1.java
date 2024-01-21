package arrays;
// basic array program
public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int [5];
		
		a[0] = 67;
		a[1]=55;
		a[2]=60;
		a[3]=85;
		a[4]=5;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		System.out.println("****************************");
		
		for(int i=0;i<=4;i++) {
			System.out.println(a[i]);
		}
	}

}
