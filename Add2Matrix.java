package arrays;

public class Add2Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = {{1,2,3},{4,5,6},{7,8,9},};
		int b[][] = {{1,2,3},{4,5,6},{7,8,9},};
		int c[][] = new int [a.length][a.length];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
	}

}
}
