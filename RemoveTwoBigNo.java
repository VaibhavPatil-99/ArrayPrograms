package array_variation;

public class RemoveTwoBigNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,8,7,1,5};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length-2;i++) {
			System.out.print(a[i]+ " ");
		}
	}

}
