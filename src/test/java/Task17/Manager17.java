package Task17;

import Task1111.Month;

public final class Manager17 extends BaseEmployee{
    private int numberOfEmployees;

    Manager17(String name, int age, String sex, double salaryForDay, int numberOfEmployees) {
        super(name, age, sex, salaryForDay);
        this.numberOfEmployees = numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public double getSalary(Month17[] array) {
        double result1 = 0;
        for(int i=0; i<array.length; i++){
            result1 += array[i].getWorkingDays() * getSalaryForDay();
        }
        double result = 0;
        result = result1 + (result1 * (0.01 * numberOfEmployees));
        return result;
    }
}
