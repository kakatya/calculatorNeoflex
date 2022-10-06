package org.example.calculatorNeoflex.service;

import org.example.calculatorNeoflex.service.calculatorarguments.HolidayPayArguments;

public class HolidayPayCalculatorService implements AbstractCalculatorService<Double, HolidayPayArguments> {

    @Override
    public Double calculate(HolidayPayArguments args) {
        double salary = args.getSalary();
        int days = args.getDays();
        return salary / 29.3 * days;
    }
}
