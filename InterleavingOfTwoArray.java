package arrays;
// Interleaving of two array arrays

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a[]= {'a','b','c','d'};
		char b[]= {'w','x','y','z'};
		char c[]= new char[a.length+b.length];
		
		int index=0;
		
		for(int i=0;i<c.length;i++) {
			if(i<a.length)
				c[index++] = a[i];
			
			if(i<b.length)
				c[index++] = b[i];
		}
		for(char d : c) {
			System.out.print(d + " ");
		}
	}

}
