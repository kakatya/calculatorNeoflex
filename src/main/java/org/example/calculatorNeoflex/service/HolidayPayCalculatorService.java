package org.example.calculatorNeoflex.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.calculatorNeoflex.service.calculatorarguments.HolidayPayArguments;

public class HolidayPayCalculatorService implements AbstractCalculatorService<Double, HolidayPayArguments> {
    static final Logger log = LogManager.getLogger(HolidayPayCalculatorService.class);

    @Override
    public Double calculate(HolidayPayArguments args) {
        double salary = args.getSalary();

        int days = args.getDays();
        log.info("salary: " + salary + " vacation days: " + days);
        return salary / 29.3 * days;
    }
}
