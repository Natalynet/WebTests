package Task17;

public final class Employee17 extends BaseEmployee{
    Employee17(String name, int age, String sex, double salaryForDay){
        super(name, age, sex, salaryForDay);
    }

    public double getSalary (Month17[] array){
        double result = 0;
        for(int i=0; i<array.length; i++){
            result +=array[i].getWorkingDays() * getSalaryForDay();
        }
        return result;
    }
}
