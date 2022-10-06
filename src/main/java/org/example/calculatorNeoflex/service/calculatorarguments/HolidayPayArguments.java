package org.example.calculatorNeoflex.service.calculatorarguments;

public class HolidayPayArguments implements AbstractArguments {
    private int days;
    private double salary;

    public HolidayPayArguments(int days, double salary) {
        this.days = days;
        this.salary = salary;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
