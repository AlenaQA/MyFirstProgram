import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.AssertTrue.assertTrue;

public class CalculatorTests {

    @Test
    public static void sumTest() {
        Calculator calculator = new Calculator();
        int c = calculator.sum(2, 3);

        //assertTrue()
    }
}
