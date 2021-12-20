package genericPracticeProblem;

public class FindmaxString <T extends Comparable<String>>{
	public String findmax(String x , String  y, String  z) {
		
		String  max = x;
		if (y.compareTo(max) >= 1){
			max = y;
			
		}
		if (z.compareTo(max) >= 1) {
			max =z;	
		}
		return max;
	}

	public static void main(String[]args) {
		
		String Intx ="Apple", Inty = "Peach",  Intz = "Banana";
		FindmaxString obj = new FindmaxString();
		System.out.println( obj. findmax(Intx, Inty, Intz));
	}
}
