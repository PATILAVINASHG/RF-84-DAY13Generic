package genericConcept;

public class MaxString {
	
public String  maximumNumber(String  x , String  y, String  z) {
	String max = x;
		if (y.length() >= max.length()) {
			max = y;
		} else if (z.length() >= max .length() ) {
			max = z;

		}
		return max;
	}
	
	public static void main(String[] args) {
		
		String doubleX = "hello ", doubleY = "world", doubleZ ="44lalddsf  ";
		MaxString obj1 = new  MaxString();
	System.out.println( obj1.maximumNumber(doubleX, doubleY, doubleZ));
		
		//System.out.println(Double.parseDouble(doubleZ));
	}

}
