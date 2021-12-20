package genericPracticeProblem;

	import org.junit.Assert;
	import org.junit.Test;

	public class TestCases {
	    @Test
	    public void First_Position_TestCase() {
	    	FindMax3Integer maxInteger = new FindMax3Integer();
	        int result = maxInteger.findmax(40,20,15);
	        Assert.assertEquals(40,result);
	    }

	    @Test
	    public void Second_Position_TestCase() {
	        FindMax3Integer maxInteger = new FindMax3Integer();
	        int result = maxInteger.findmax(10,20,15);
	        Assert.assertEquals(20,result);
	    }

	    @Test
	    public void Third_Position_TestCase() {
	    	FindMax3Integer maxInteger = new FindMax3Integer();
	        int result = maxInteger.findmax(40,20,75);
	        Assert.assertEquals(75,result);
	    }

	    @Test
	    public void First_Position_Double_TestCases() {
	    	FindMax3Float  maxDouble = new FindMax3Float ();
	        Double result = maxDouble.findmax(4.2,2.5,3.1);
	        Assert.assertEquals((Double) 4.2,result);
	    }

	    @Test
	    public void Second_Position_Float_TestCases() {
	    	FindMax3Float maxDouble = new FindMax3Float();
	        Float result = maxDouble.findmax(2.5,4.2,3.1);
	        Assert.assertEquals((Float) 4.2,result);
	    }

	    @Test
	    public void Third_Position_Double_TestCases() {
	    	FindMax3Float  maxDouble = new FindMax3Float ();
	        Float result = maxDouble.findmax(3.1,3.5,4.2);
	        Assert.assertEquals((Double) 4.2,result);
	    }

	    @Test
	    public void First_Position_String_TestCases() {
	    	FindmaxString maxString = new FindmaxString();
	        String result = maxString.findmax("Apple","Peach","Banana");
	        Assert.assertEquals("Peach",result);
	    }

	    @Test
	    public void Second_Position_String_TestCases() {
	    	FindmaxString maxString = new FindmaxString();
	        String result = maxString.findmax("Peach","Banana","Apple");
	        Assert.assertEquals("Peach",result);
	    }

	    @Test
	    public void Third_Position_String_TestCases() {
	    	FindmaxString maxString = new FindmaxString();
	        String result = maxString.findmax("Banana","Apple","Peach");
	        Assert.assertEquals("Peach",result);
	    }
}
