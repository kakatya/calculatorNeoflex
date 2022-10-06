package org.example.calculatorNeoflex.service;

import org.example.calculatorNeoflex.service.calculatorarguments.AbstractArguments;

public interface AbstractCalculatorService<T, P extends AbstractArguments> {
    T  calculate(P args);
}
