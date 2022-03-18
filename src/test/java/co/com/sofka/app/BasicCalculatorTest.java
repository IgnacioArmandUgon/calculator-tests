package co.com.sofka.app;

import co.com.sofka.app.calculator.BasicCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1 + 1 = 2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(2, result);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing sub: 4 - 1 = 3")
    public void sub() {
        // Arrange
        Long number1 = 4L;
        Long number2 = 1L;

        // Act
        Long result = basicCalculator.sub(number1, number2);

        // Assert
        assertEquals(3, result);
    }

    @DisplayName("Testing several subs")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "1,    1,   0",
            "2,    1,   1",
            "100,  51, 49",
            "100,  1, 99"
    })
    public void severalSub(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sub(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing sub: 2 * 3 = 6")
    public void multi() {
        // Arrange
        Long number1 = 2L;
        Long number2 = 3L;

        // Act
        Long result = basicCalculator.multi(number1, number2);

        // Assert
        assertEquals(6, result);
    }

    @DisplayName("Testing several subs")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "1,    1,   1",
            "2,    2,   4",
            "3,  33, 99",
            "6,  2, 12"
    })
    public void severalMulti(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multi(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing sub: 6 / 3 = 2")
    public void div() {
        // Arrange
        Long number1 = 6L;
        Long number2 = 3L;

        // Act
        Long result = basicCalculator.div(number1, number2);

        // Assert
        assertEquals(2, result);
    }

    @DisplayName("Testing several subs")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "4,    2,   2",
            "2,    2,   1",
            "33,  3, 11",
            "100,  25, 4"
    })
    public void severalDiv(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.div(first, second),
                () -> first + " / " + second + " should equal " + expectedResult);
    }
}
