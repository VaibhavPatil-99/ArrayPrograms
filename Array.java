package parmaneSir;

public class Array {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=20;
		int num2=10;
		int a[] = myMethod(num1,num2);
		System.out.println("addition is : "+a[0]);
	   System.out.println("subtraction is : "+a[1]);	
	}
	
	public static  int[] myMethod(int num1,int num2) {
		
		int add = num1+num2;
		int sub = num1-num2;
		int a[] =new int[2];
		a[0]=add;
		a[1]=sub;
		return a;
	}

}
