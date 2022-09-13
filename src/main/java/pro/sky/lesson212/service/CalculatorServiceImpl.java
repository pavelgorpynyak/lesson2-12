package pro.sky.lesson212.service;

import org.springframework.stereotype.Service;
import pro.sky.lesson212.exception.DivideToZeroException;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String welcomeMessage() {
        return "<b>Welcome to calculator!</b>";
    }
    @Override
    public int plus( int num1, int num2 ) {
        return num1 + num2;
    }
    @Override
    public int minus( int num1, int num2 ) {
        return num1 - num2;
    }
    @Override
    public int multiply( int num1, int num2 ) {
        return num1 * num2;
    }
    @Override
    public int divide( int num1, int num2 ) {
        if (num2 == 0) {
            throw new DivideToZeroException("На ноль делить нельзя!");
        }
        return num1 / num2;
    }
}
