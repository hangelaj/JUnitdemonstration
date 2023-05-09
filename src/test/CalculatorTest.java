import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator cal = new Calculator();

    @Test
    void TwoPlusTwoEqual() {
        assertEquals(4, cal.add(2, 2));
    }

    @Test
    void TwoPlusThreeEqual() {
        assertEquals(5, cal.add(2, 3));
    }

    @Test
    void FivePlusThreeEqual() {
        assertEquals(8, cal.add(5, 3));
    }
    @Test
    void TenPlusThreeEqual() {
        assertEquals( 13, cal.add(10, 3));
}
}