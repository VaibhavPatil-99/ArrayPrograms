package array_variation;

public class Double_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,8};
		
		int b=2;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b) {
				b=b*2;
			}
		}
		System.out.print(b);
	}

}
