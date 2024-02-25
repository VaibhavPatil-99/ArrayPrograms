package array_variation;

// find index of a different/distinct element

public class FindIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,4,6,8,9,10,12};
		int b[]= {2,4,6,8,10,12};
		
		int i=0;
		
		while(true) {
			if(a[i]==b[i]) {
				i++;
			}
				else {
					System.out.println(i);
					break;
				}
			}
		}
	}


