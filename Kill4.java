package array_variation;

public class Kill4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int num=1;
		int index=0;
		
		while(a.length>1) {
			
			if(num==4) {
				a=shubham(a,index);
				num=1;
			}
			else {
				num++;
				index++;
				if(index>=a.length)
					index=0;
			}
		}
		System.out.println(a[0]);
	}

	private static int[] shubham(int[] a, int index) {
	
		int b[]=new int[a.length-1];
		int j=0;
		
		for(int i=0;i<a.length;i++) {
			if(i!=index)
				b[j++]=a[i];
		}
		return b;
	}

}
