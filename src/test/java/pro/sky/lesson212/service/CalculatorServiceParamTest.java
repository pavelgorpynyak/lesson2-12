package pro.sky.lesson212.service;

import org.assertj.core.internal.bytebuddy.asm.Advice;
import org.assertj.core.internal.bytebuddy.asm.Advice.Argument;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.lesson212.service.Numbers.*;

public class CalculatorServiceParamTest {

    CalculatorService calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("fromCalculatorParam")
    public void haveToBeCorrectResultAfterPlus( int num1, int num2 ) {
        int result = calculatorService.plus(num1, num2);
        assertEquals(num1 + num2, result);
    }

    @ParameterizedTest
    @MethodSource("fromCalculatorParam")
    public void haveToBeCorrectResultAfterMinus( int num1, int num2 ) {
        int result = calculatorService.minus(num1, num2);
        assertEquals(num1 - num2, result);
    }

    @ParameterizedTest
    @MethodSource("fromCalculatorParam")
    public void haveToBeCorrectResultAfterMultiply( int num1, int num2 ) {
        int result = calculatorService.multiply(num1, num2);
        assertEquals(num1 * num2, result);
    }

    @ParameterizedTest
    @MethodSource("fromCalculatorParam")
    public void haveToBeCorrectResultAfterDivide( int num1, int num2 ) {
        int result = calculatorService.divide(num1, num2);
        assertEquals(num1 / num2, result);
    }

    private static Stream<Arguments> fromCalculatorParam() {
        return Stream.of(
                Arguments.of(ONE, TWO),
                Arguments.of(TWO, TWO),
                Arguments.of(TWO, THREE),
                Arguments.of(ZERO, ONE)
        );
    }

}
