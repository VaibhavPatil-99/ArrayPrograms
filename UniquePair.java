package arrays;

public class UniquePair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,2,3};
		int count =0;
		
		for(int i=0;i<a.length;i++) {
			int cnt = 0;
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					cnt++;
					break;
				}
			}
			if(cnt == 0) {
				count++;
				
			}
		}
		int b[]=new int[count];
		int index=0;
		for(int i=0;i<a.length;i++) {
			int cnt = 0;
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					cnt++;
					break;
				}
			}
			if(cnt == 0) {
				b[index++]=a[i];
				
			}
			
		}
		
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				System.out.println(b[i] + " " + b[j]);
			}
		}
			
	}

}
