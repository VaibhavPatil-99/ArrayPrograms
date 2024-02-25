package array_variation;

public class pattern321 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=3;
		int row=n;
		
		while(row>0)
		{
			int num = n;
			while(num>0) {
				for(int i=0;i<row;i++) 
					System.out.print(num+ " ");				
			num--;
			}
		
		System.out.println();
		row--;
		}
	}

}
