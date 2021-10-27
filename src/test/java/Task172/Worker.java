package Task172;

public class Worker implements IEmployee {
    private String name;
    private double baseSalary;

    Worker(String name, double baseSalary){
        this.setName(name);
        this.setBaseSalary(baseSalary);
    }
    public String getName(){
        return name;
    };
    public void setName (String name){
        this.name = name;
    };
    public double getBaseSalary(){
        return baseSalary;
    };
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    };

    public double getSalary(){
        return getBaseSalary();
    }
}
