import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FactorialTest {

    @Test
    public void factorialZeroTest() {
       assertEquals(1, Factorial.calculateFactorial(0));
    }
    @Test
    public void factorialOneTest() {
        assertEquals (1, Factorial.calculateFactorial(1));

    }
    @Test
    public void factorialFiveTest() {
        assertEquals (120, Factorial.calculateFactorial(5));

    }
    @Test
    public void factorialNegativTest() {
        assertThrows (IllegalArgumentException.class, ()-> Factorial.calculateFactorial(-1));

    }
}
