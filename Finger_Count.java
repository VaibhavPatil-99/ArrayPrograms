package array_variation;

public class Finger_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 10;
		int finger =0;
		int incDec =0;
		
		while(count>0) {
			
			if(incDec==0)
				finger++;
			else
				finger--;
			
			if(finger==5)
				incDec=1;
			if(finger==1)
				incDec=0;
			
			count--;
		}
		System.out.println(finger);
	}

}
