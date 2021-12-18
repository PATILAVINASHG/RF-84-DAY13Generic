package genericConcept;

public class MaxNumberDouble {
	
	public double maximumNumber(double x , double y, double z) {
		
		if (x > y &&  x > z) {
			return x;
		} else if (y > x && y >z ) {
			return y;
		} else{
			return z;
		}
	}
	
	public static void main(String[] args) {
		
		double doubleX = 45, doubleY = 98, doubleZ =44 ;
	 MaxNumberDouble obj1 = new  MaxNumberDouble();
	System.out.println( obj1.maximumNumber(doubleX, doubleY, doubleZ));
		
	}

}
