import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class CalculatorTest {
    @Test void testAddition() {
        assertEquals(30, new Calculator().add(10, 20));
    }
}
