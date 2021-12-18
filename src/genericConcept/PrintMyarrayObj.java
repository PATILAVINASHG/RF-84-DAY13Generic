package genericConcept;

public class PrintMyarrayObj<X , Y, Z > {

	X[]myXArray;
	Y[] myYArray;
	Z[] myZArray;
	public PrintMyarrayObj(X[] myXArray, Y[] myYArray, Z[] myZArray) {
	
		this.myXArray = myXArray;
		this.myYArray = myYArray;
		this.myZArray = myZArray;
	}
	
	public static void main (String[]args) {
		
		Integer []a = {1,2, 3};
		Double []b = {1.2, 1.3, 1.6};
		Character[]c = {'a', 'b','c'};
		
		new PrintMyarrayObj<Integer , Double, Character>(a, b, c).toPrint();

	}
	private void toPrint() {
		toPrint(myXArray);
		toPrint(myYArray);
		toPrint(myZArray);
	}
		
	private static<E> void toPrint(E [] x) {
		for (E i : x) {
			System.out.println(i);
}
}
	}