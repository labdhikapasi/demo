import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest extends TestCase {

    Calculator calculator=new Calculator();
    public void testMain() {
    }

    @Test
    public void testFactTruePositive() {
        assertEquals("Factorial of the number for True Positive ",1,calculator.factorial(0));
        assertEquals("Factorial of the number for True Positive",1,calculator.factorial(1));
        assertEquals("Factorial of the number for True Positive",120,calculator.factorial(5));
    }


    public void testFactFalsePositive() {
        assertNotEquals("Factorial of the number for False Positive ",0,calculator.factorial(0));
        assertNotEquals("Factorial of the number for False Positive",0,calculator.factorial(1));
        assertNotEquals("Factorial of the number for False Positive",0,calculator.factorial(5));
    }

    public void testSquareRootTruePositive() {
        assertEquals("Square Root of the number for True Positive ",0.0,calculator.squareRoot(0));
        assertEquals("Square Root of the number for True Positive",1.0,calculator.squareRoot(1));
        assertEquals("Square Root of the number for True Positive",2.0,calculator.squareRoot(4));

    }

    public void testSquareRootFalsePositive() {
        assertNotEquals("Square Root of the number for False Positive ",1,calculator.squareRoot(0));
        assertNotEquals("Square Root of the number for False Positive",-1,calculator.squareRoot(1));
        assertNotEquals("Square Root of the number for False Positive",20,calculator.squareRoot(4));

    }
    public void testLogarithmTruePositive() {
        assertEquals("Logarithm of the number for True Positive ",0.0,calculator.log(1));
//        assertEquals("Logarithm of the number for True Positive",1,calculator.logarithm(1));
//        assertEquals("Logarithm of the number for True Positive",2,calculator.logarithm(4));
    }

    public void testPowerTruePositive() {
        assertEquals("Power of the number for True Positive ",1.0,calculator.power(0,0));
        assertEquals("Power of the number for True Positive",8.0,calculator.power(2,3));
        assertEquals("Power of the number for True Positive",-1.0,calculator.power(-1,3));
    }

    public void testPowerFalsePositive() {
        assertNotEquals("Power of the number for false Positive ",0,calculator.power(0,0));
        assertNotEquals("Power of the number for false Positive",6,calculator.power(2,3));
        assertNotEquals("Power of the number for false Positive",1,calculator.power(-1,3));
    }
}
