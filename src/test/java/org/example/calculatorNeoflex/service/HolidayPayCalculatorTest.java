package org.example.calculatorNeoflex.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.calculatorNeoflex.controller.SalaryController;
import org.example.calculatorNeoflex.service.calculatorarguments.HolidayPayArguments;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HolidayPayCalculatorTest {
    static final Logger log = LogManager.getLogger(HolidayPayCalculatorTest.class);
    private final HolidayPayCalculatorService calculator = new HolidayPayCalculatorService();

    @Test
    public void calculateTest() throws Exception {
        HolidayPayArguments arguments = new HolidayPayArguments(28, 100000);
        double result = calculator.calculate(arguments);
        log.info("vacation days: " + 28 + " salary is: " + 100000);
        log.info("expected: " + 95563.13993174062 + " actual: " + result);
        Assertions.assertEquals(95563.13993174062, result);
    }
}
