import org.testng.annotations.Test;
import static org.testng.Assert.*;



public class FactorialTest {

    @Test
    public void factorialZeroTest() {
       assertEquals (1, Factorial.calculateFactorial(0));

    }
}
