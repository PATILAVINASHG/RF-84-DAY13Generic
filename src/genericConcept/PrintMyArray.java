package genericConcept;

public class PrintMyArray {
	public static void main(String[] args) {
		Integer []a = {1,2, 3};
		Double []b = {1.2, 1.3, 1.6};
		Character[]c = {'a', 'b','c'};
		toPrint(a);
		toPrint(b);
		toPrint(c);
	}
	
private static<E> void toPrint(E [] x) {
	for (E i : x) {
		System.out.println(i);
		
	}	
}
}