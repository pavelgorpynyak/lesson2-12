package pro.sky.lesson212.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.lesson212.exception.DivideToZeroException;
import pro.sky.lesson212.service.CalculatorServiceImpl;
@RestController
@RequestMapping ("/calculator")
public class CalculatorController {
    public CalculatorServiceImpl calculatorServiceImpl;

    public CalculatorController( CalculatorServiceImpl calculatorServiceImpl ) {
        CalculatorServiceImpl calculatorServiceImp;
        this.calculatorServiceImpl = calculatorServiceImpl;
    }


    @GetMapping(path = "/calculator")
    public String welcomeMessage() {
        return calculatorServiceImpl.welcomeMessage();
    }


    @GetMapping(path = "/plus")
    public String calculatorPlus( @RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2 ) {
        int sum = calculatorServiceImpl.plus(num1, num2);
        return num1 +"+" +num2 +"=" + sum;
    }

    @GetMapping(path = "/minus")
    public String calculatorMinus( @RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2 ) {
        int sum = calculatorServiceImpl.minus(num1, num2);
        return num1 +"-" +num2 +"=" + sum;
    }

    @GetMapping(path = "/multiply")
    public String calculatorMultiply( @RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2 ) {
        int sum = calculatorServiceImpl.multiply(num1, num2);
        return num1 +"*" +num2 +"=" + sum;
    }

    @GetMapping(path = "/divide")
    public String calculatorDivide( @RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2 ) {
            int sum = calculatorServiceImpl.divide(num1, num2);
            return num1 + "/" + num2 + "=" + sum;
        }
    }
