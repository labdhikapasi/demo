import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator=new Calculator();
    @Test
    public void testMain() {
    }

    @Test
    public void testFactTruePositive() {
        assertEquals("Factorial of 0 should be 1 ", 1, calculator.factorial(0));
        assertEquals("Factorial of 1 should be 1", 1, calculator.factorial(1));
        assertEquals("Factorial of 5 should be 120", 120, calculator.factorial(5));
    }


    @Test
    public void testFactFalsePositive() {
        assertNotEquals("Factorial of 0 should not be 0 ",0,calculator.factorial(0));
        assertNotEquals("Factorial of 1 should not be 0",0,calculator.factorial(1));
        assertNotEquals("Factorial of 5 should not be 0",0,calculator.factorial(5));
    }

    @Test
    public void testSquareRootTruePositive() {
        assertEquals("Square Root of 0 should be 0.0 ", 0.0, calculator.squareRoot(0));
        assertEquals("Square Root of 1 should be 1.0", 1.0, calculator.squareRoot(1));
        assertEquals("Square Root of 4 should be 2.0", 2.0, calculator.squareRoot(4));

    }

    @Test
    public void testSquareRootFalsePositive() {
        assertNotEquals("Square Root of 0 should not be 1 ",1,calculator.squareRoot(0));
        assertNotEquals("Square Root of 1 should not be -1",-1,calculator.squareRoot(1));
        assertNotEquals("Square Root of 25 should not be 20",20,calculator.squareRoot(25));

    }
    @Test
    public void testLogarithmTruePositive() {
        assertEquals("Logarithm of the number for True Positive ", 0.0, calculator.log(1));
//        assertEquals("Logarithm of the number for True Positive",1,calculator.logarithm(1));
//        assertEquals("Logarithm of the number for True Positive",2,calculator.logarithm(4));
    }

    @Test
    public void testPowerTruePositive() {
        assertEquals("Power of the number for True Positive ", 1.0, calculator.power(0, 0));
        assertEquals("Power of the number for True Positive", 8.0, calculator.power(2, 3));
        assertEquals("Power of the number for True Positive", -1.0, calculator.power(-1, 3));
    }

    @Test
    public void testPowerFalsePositive() {
        assertNotEquals("Power of the number for false Positive ",0,calculator.power(0,0));
        assertNotEquals("Power of the number for false Positive",6,calculator.power(2,3));
        assertNotEquals("Power of the number for false Positive",1,calculator.power(-1,3));
    }
}
