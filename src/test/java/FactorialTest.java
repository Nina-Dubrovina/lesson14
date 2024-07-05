import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FactorialTest {

    @Test
    public void factorialZeroTest() {
       assertEquals(1, Factorial.calculateFactorial(0));
    }
}
