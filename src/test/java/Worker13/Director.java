package Worker13;

public final class Director extends Worker{

    private int numberOfSubbordinates;
    Director(String name, double baseSalary, int numberOfSubbordinates) {
        super(name, baseSalary);
        this.numberOfSubbordinates = numberOfSubbordinates;
    }

    public int getNumberOfSubbordinates(){
        return numberOfSubbordinates;
    }
        @Override
        public double getSalary(){
            double salary;
            if(getNumberOfSubbordinates()!=0){
                return super.getBaseSalary()*(getNumberOfSubbordinates()/100.0*9);
            }
            else{
                return super.getBaseSalary();
            }
        }

}
