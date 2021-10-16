package Worker13;

public class Worker extends Employee{

    Worker(String name, double baseSalary){
        this.setName(name);
        this.setBaseSalary(baseSalary);
    }

    @Override
    public double getSalary(){
        return getBaseSalary();
    }
}
