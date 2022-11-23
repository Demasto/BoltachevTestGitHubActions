import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void additional(){
        assertEquals(2,calculator.add(2,1));
    }
    @Test
    void difference(){
        assertEquals(3,calculator.dif(7,4));
    }
    @Test
    void multiplication(){
        assertEquals(12,calculator.mul(5,3));
    }
    @Test
    void division(){
        assertEquals(3,calculator.div(27,7));
    }
}
