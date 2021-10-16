package Worker13;

public class Director extends Manager{

    Director(String name, double baseSalary, int numberOfSubbordinates) {
        super(name, baseSalary, numberOfSubbordinates);
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
