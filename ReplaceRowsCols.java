package arrays;

public class ReplaceRowsCols {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = {{1,2,3},{4,5,6},{7,8,9},};
		int b[][] = new int [a.length][a.length];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				b[j][i] = a[i][j];
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("****************************");
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		
		
		
	}

}
}
