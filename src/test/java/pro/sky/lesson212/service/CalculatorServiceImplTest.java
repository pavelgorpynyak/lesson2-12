package pro.sky.lesson212.service;

import org.apache.tomcat.util.bcel.classfile.Constant;
import org.junit.jupiter.api.Test;
import pro.sky.lesson212.exception.DivideToZeroException;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.lesson212.service.Numbers.*;

class CalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void resultOfSumOneAndOneHaveToBeTwo() {
        int result = calculatorService.plus(ONE, ONE);
        assertEquals(TWO, result);

    }

    @Test
    public void resultOfSumOneAndTwoHaveToBeThree() {
        int result = calculatorService.plus(TWO, ONE);
        assertEquals(THREE, result);
    }

    @Test
    public void resultOfMinusOneAndOneHaveToBeZero() {
        int result = calculatorService.minus(ONE, ONE);
        assertEquals(ZERO, result);
    }

    @Test
    public void resultOfMinusThreeAndTwoHaveToBeOne() {
        int result = calculatorService.minus(THREE, TWO);
        assertEquals(ONE, result);
    }

    @Test
    public void resultOfMultiplyOneAndTwoHaveToBeTwo() {
        int result = calculatorService.multiply(ONE, TWO);
        assertEquals(TWO, result);
    }

    @Test
    public void resultOfMultiplyZeroAndTwoHaveToBeZero() {
        int result = calculatorService.multiply(ZERO, TWO);
        assertEquals(ZERO, result);
    }

    @Test
    public void resultOfDivideThreeAndOneHaveToBeThree() {
        int result = calculatorService.divide(THREE, ONE);
        assertEquals(THREE, result);
    }

    @Test
    public void resultOfDivideOneAndOneHaveToBeOne() {
        int result = calculatorService.divide(ONE, ONE);
        assertEquals(ONE, result);
    }

    @Test
    public void resultOfDivideOneAndZeroHaveToExeption() {
        assertThrows(DivideToZeroException.class,()-> calculatorService.divide(ONE, ZERO));
    }
}