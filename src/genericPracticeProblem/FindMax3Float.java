package genericPracticeProblem;

public class FindMax3Float <T extends Comparable<T>> {
		
		public Float findmax(Float x ,Float  y, Float z) {
			
			Float  max = x;
			if (y.compareTo(max) >= 1){
				max = y;
				
			}
			if (z.compareTo(max) >= 1) {
				max =z;	
			}
			return max;
		}

		public static void main(String[]args) {
			
			Float floatx = (float) 4.0, floaty = (float) 50.22, floatz = (float) 90.66;
			FindMax3Float <Float> obj = new FindMax3Float();
			System.out.println( obj. findmax(floatx, floaty, floatz));
			
		}

}
