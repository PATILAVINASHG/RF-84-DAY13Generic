package genericPracticeProblem;

public class FindMax3Integer <T extends Comparable<T>> {
	
	public Integer findmax(Integer x , Integer  y, Integer  z) {
		
		Integer  max = x;
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
		FindMax3Integer<Integer> obj = new FindMax3Integer();
		System.out.println( obj. findmax(Intx, Inty, Intz));
		
	}
	
}
