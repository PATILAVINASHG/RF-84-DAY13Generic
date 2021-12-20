package genericPracticeProblem;
   

public class Generic <T extends Comparable<T>> {
	
	 T x, y, z;

	public Generic(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	 public T maximum(){
		 
		 return Generic.maximum(x, y, z);
	 }
	 
	
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		

		T  max = x;
		if (y.compareTo(max) >= 1){
			max = y;
			
		}
		if (z.compareTo(max) >= 1) {
			max =z;	
		}
		return max;		
			
	}
	public static void main(String[]args) {
		
		 Integer Intx =40, Inty = 5,  Intz = 9;
		 Double  doublex = 12.2, doubley = 52.2, doublez = 56.3;
		 String stringx= "Hello", stringy = "avinash" , stringz = "patil";
		 
	Generic obj =  
	new Generic(stringz, stringz, stringz);	 
		 System.out.println(obj.maximum());
		 
	}
}
