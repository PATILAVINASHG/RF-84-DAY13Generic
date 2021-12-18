package genericConcept;

public class FindMaxIntegerUC1  {

	public int maximumNumber(int x , int y, int z) {
		
		if (x > y &&  x > z) {
			return x;
		} else if (y > x && y >z ) {
			return y;
		} else{
			return z;
		}
	}
	
	public static void main(String[] args) {
		
		int IntX = 45 , IntY = 98, IntZ =44 ;
	 FindMaxIntegerUC1 obj1 = new  FindMaxIntegerUC1();
	System.out.println( obj1.maximumNumber(IntX, IntY, IntZ));
		
	}

}
