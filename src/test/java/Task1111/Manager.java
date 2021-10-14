package Task1111;

public class Manager extends Employee {
    private int numberOfEmployees;

    Manager(String name, int age, String sex, double salaryForDay, int numberOfEmployees) {
        super(name, age, sex, salaryForDay);
        this.numberOfEmployees = numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public double getSalary(Month[] array) {
        double result = 0;
        result = super.getSalary(array) + (super.getSalary(array) * (0.01 * numberOfEmployees));
        return result;
    }

}

class Test111 {
    public static void main(String[] args) {
        Manager M = new Manager("Colya", 30, "Male", 5.1, 2);
        MonthUnits month = new MonthUnits();
        Month[] array = {month.February, month.March};
        System.out.println(M.getSalary(array));

        int workingDays = 0;
        for (int i = 0; i < month.months.length; i++) {
            workingDays += month.months[i].workingDays;
        }
        System.out.println(workingDays);

    }
}
