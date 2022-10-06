package org.example.calculatorNeoflex.service;

import org.example.calculatorNeoflex.service.calculatorarguments.HolidayPayArguments;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HolidayPayCalculatorTest {
    private final HolidayPayCalculatorService calculator = new HolidayPayCalculatorService();

    @Test
    public void calculateTest() throws Exception {
        HolidayPayArguments arguments = new HolidayPayArguments(28, 100000);
        double result = calculator.calculate(arguments);
        Assertions.assertEquals(95563.13993174062, result);
    }
}
