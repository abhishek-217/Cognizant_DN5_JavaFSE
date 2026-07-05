import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    Calculator calculator;

    @BeforeEach // run before test
    void setup() {
        calculator = new Calculator();
        System.out.println("Setup executed");
    }

    @AfterEach // run after every test
    void cleanup() {
        System.out.println("Cleanup executed");
    }

    @Test //marks test
    void testAddition() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a,b);

        // Assert
        assertEquals(30,result);
    }
}
