/**
 * ToppingsTest
 *
 * We inherit from Cookie, but are only responsible for our concrete methods.
 */

// Stuff to redirect System.out for testing purposes.
import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

// Stuff needed for JUnit testing.
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class ToppingsTest {   
    Cookie yum;
    @BeforeEach    
    void init() {
        yum = new XxxxCookie();              
        yum = new PowderedSugar(yum);
        yum = new Sprinkles(yum);
        yum = new Walnuts(yum);
        yum = new Pecans(yum);
        yum = new ChocolateChips(yum);
    }
    
    @Test
    public void testConstructor() {
	// Surround in a try/catch to make sure it works okay or not!
	try {
	    // if we make it here then we assume the constructor worked.
	    // And since the concrete constructor calls the superclass
	    //   constructor, then that must also have worked!!
	    // Let's just make sure it's not null, which would be bad...
	    assertNotNull(yum);
	}
	catch (Exception e) {
	    // Should NOT get here, if so then test probably should fail.
	    fail("Constructor threw exception: " + e.getMessage());
	}
    }

    @Test
    public void testDescription() {
	// 1. Prep for test
	// 1a. Make object that has method needing testing.

	// 1b. Declare actual and expected outputs
	String expectedResult = "XxxxCookie for testing only!, Powdered Sugar, Sprinkles, Walnuts, Pecans, Chocolate Chips";
	String testOutput = null;

	// 2. Conduct test of method 
	testOutput = yum.getDescription();

	// 3b. Check results
	//      (Can't compare String object NAMES, need to compare chars!!)
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult
		   + "' but got '" + testOutput + "'.");
    }

    @Test
    public void testCalories() {
	// 1. Prep for test
	// 1a. Make object that has method needing testing.
	// 1b. Declare actual and expected outputs
	int expectedResult = 30 + 10 + 45 + 55 + 60;
	int testOutput = 0;

	// 2. Conduct test of method 
	testOutput = yum.calories();

	// 3b. Check results
	//      (Can't compare String object NAMES, need to compare chars!!)
	assertEquals(expectedResult, testOutput, 
		     "Expected: " + expectedResult 
		     + ", but got: " + testOutput);
    }

    @Test
    public void testCost() {
	// 1. Prep for test
	// 1a. Make object that has method needing testing.
	// 1b. Declare actual and expected outputs
	double expectedResult = 0.25 + 0.15 + 0.50 + 0.40 + 0.55;
	double testOutput = 0;

	// 2. Conduct test of method 
	testOutput = yum.cost();

	// 3b. Check results
	//      (Can't compare String object NAMES, need to compare chars!!)
	assertEquals(expectedResult, testOutput, 
		     "Expected: " + expectedResult 
		     + ", but got: " + testOutput);
    }

    @Test
    public void testToString() {
	// 1. Prep for test
	// 1a. Make object that has method needing testing.
	// 1b. Declare actual and expected outputs
	String expectedResult = "[XxxxCookie for testing only!, Powdered Sugar, Sprinkles, Walnuts, Pecans, Chocolate Chips,200,$ 1.85]CONTAINS NUTS!";
	String testOutput = null;

	// 1c. Save current System.out and set to new stream we can read.
	PrintStream origOut = System.out;
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream newOut = new PrintStream(baos);
	System.setOut(newOut);

	// 2. Conduct method test (print/println call toString automatically)
	System.out.print(yum);

	// 3. Test Cleanup
	// 3a.Get all the stuff the method wrote to System.out, and reset it.
	System.out.flush();
	testOutput = baos.toString();
	System.setOut(origOut);

	// 3b. Check results
	//      (Can't compare String object NAMES, need to compare chars!!)
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
    }    
    
    @Test
    public void testHasNutsWalnuts() {
    Cookie yum1 = new XxxxCookie();
    yum1 = new Walnuts(yum1);
    yum1 = new Sprinkles(yum1);
	// 1. Prep for test
	// 1a. Make object that has method needing testing.
	// 1b. Declare actual and expected outputs
	String expectedResult = "[XxxxCookie for testing only!, Walnuts, Sprinkles,55,$ 0.65]CONTAINS NUTS!";
	String testOutput = null;

	// 1c. Save current System.out and set to new stream we can read.
	PrintStream origOut = System.out;
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream newOut = new PrintStream(baos);
	System.setOut(newOut);

	// 2. Conduct method test (print/println call toString automatically)
	System.out.print(yum1);

	// 3. Test Cleanup
	// 3a.Get all the stuff the method wrote to System.out, and reset it.
	System.out.flush();
	testOutput = baos.toString();
	System.setOut(origOut);

	// 3b. Check results
	//      (Can't compare String object NAMES, need to compare chars!!)
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
    }
            
    @Test
    public void testHasNutsPecans() {
    Cookie yum1 = new XxxxCookie();
    yum1 = new Pecans(yum1);
    yum1 = new PowderedSugar(yum1);
	// 1. Prep for test
	// 1a. Make object that has method needing testing.
	// 1b. Declare actual and expected outputs
	String expectedResult = "[XxxxCookie for testing only!, Pecans, Powdered Sugar,85,$ 0.65]CONTAINS NUTS!";
	String testOutput = null;

	// 1c. Save current System.out and set to new stream we can read.
	PrintStream origOut = System.out;
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream newOut = new PrintStream(baos);
	System.setOut(newOut);

	// 2. Conduct method test (print/println call toString automatically)
	System.out.print(yum1);

	// 3. Test Cleanup
	// 3a.Get all the stuff the method wrote to System.out, and reset it.
	System.out.flush();
	testOutput = baos.toString();
	System.setOut(origOut);

	// 3b. Check results
	//      (Can't compare String object NAMES, need to compare chars!!)
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
    }
        
    @Test
    public void testHasNoNuts() {
    Cookie yum1 = new XxxxCookie();
    yum1 = new ChocolateChips(yum1);
    yum1 = new Sprinkles(yum1);
    yum1 = new PowderedSugar(yum1);
	// 1. Prep for test
	// 1a. Make object that has method needing testing.
	// 1b. Declare actual and expected outputs
	String expectedResult = "[XxxxCookie for testing only!, Chocolate Chips, Sprinkles, Powdered Sugar,100,$ 0.9500000000000001]";
	String testOutput = null;

	// 1c. Save current System.out and set to new stream we can read.
	PrintStream origOut = System.out;
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream newOut = new PrintStream(baos);
	System.setOut(newOut);

	// 2. Conduct method test (print/println call toString automatically)
	System.out.print(yum1);

	// 3. Test Cleanup
	// 3a.Get all the stuff the method wrote to System.out, and reset it.
	System.out.flush();
	testOutput = baos.toString();
	System.setOut(origOut);

	// 3b. Check results
	//      (Can't compare String object NAMES, need to compare chars!!)
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
    }    
}
