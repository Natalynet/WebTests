package Task172;

public class Director extends Worker implements IManager{

        private int numberOfSubordinates;
        Director(String name, double baseSalary, int numberOfSubbordinates) {
            super(name, baseSalary);
            this.numberOfSubordinates = numberOfSubbordinates;
        }


    @Override
    public void setNumberOfSubordinates(int numberOfSubbordinates) {

    }
    @Override
    public int getNumberOfSubordinates(){
            return numberOfSubordinates;
        }

    @Override
    public double getSalary(){
        double salary;
        if(getNumberOfSubordinates()!=0){
            return super.getBaseSalary()*(getNumberOfSubordinates()/100.0*9);
        }
        else{
            return super.getBaseSalary();
        }
    }
}
