package Worker13;

public abstract class Employee {
    private String name;
    private double baseSalary;


    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name=name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }
    public abstract double getSalary();

}
