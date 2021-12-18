package genericConcept;

public class MaxNumberComp<T extends Comparable<T>> {
	public T findmax(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) >= 1) {
			max= y;
		}
		if (z.compareTo(max) >= 1) {
			max =z;	
		}
		return max;
		}
	

	public static void main(String[] args) {
		String doubleX = "zello ", doubleY = "world", doubleZ ="zlalddsf  ";
		Integer Intx =80, Inty = 50, Intz =60; 
		MaxNumberComp<Integer> obj1 = new  MaxNumberComp();
	System.out.println( obj1. findmax(Intx, Inty, Intz));
		
	}

}
