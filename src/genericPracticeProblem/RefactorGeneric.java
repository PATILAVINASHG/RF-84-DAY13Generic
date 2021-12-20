package genericPracticeProblem;

public class RefactorGeneric <T extends Comparable<T>> {

		
		public T findmax(T x , T  y, T z) {
			
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
			 
			RefactorGeneric <Integer> OB = new RefactorGeneric();
			RefactorGeneric <Double> OB1 = new RefactorGeneric();
			RefactorGeneric <String> OB2 = new RefactorGeneric();
			System.out.println( OB. findmax(Intx, Inty, Intz));
			System.out.println( OB1. findmax(doublex, doubley, doublez));
			System.out.println( OB2. findmax(stringx, stringy,stringz));

}
}
