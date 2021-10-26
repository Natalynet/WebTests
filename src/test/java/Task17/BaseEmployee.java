package Task17;

public abstract class BaseEmployee {
    private String name;
    private int age;
    private String sex;
    private double salaryForDay;

    BaseEmployee(String name, int age, String sex, double salaryForDay){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryForDay = salaryForDay;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;

    }
    public void setSex(String sex){
        this.sex = sex;

    }
    public void setSalaryForDay(double salaryForDay){
        this.salaryForDay = salaryForDay;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getSex(){
        return sex;
    }
    public double getSalaryForDay(){
        return salaryForDay;
    }

    public abstract double getSalary (Month17[] array);

}
