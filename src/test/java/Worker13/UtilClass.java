package Worker13;

public class UtilClass {

    public Employee findEmployeeByName (Employee [] array, String name){
        for(int i=0; i<array.length; i++){
            if(array[i].getName().equals(name)){
               return array[i];

            }
        }
        return null;
    }

    public Employee nameContains (Employee [] array, String a){
        for(int i=0; i<array.length; i++){
            if((array[i].getName()).contains(a)){
                return array[i];
            }
        }
        return null;
    }

    public double allSalary(Employee[] array){
        double sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i].getSalary();
        }
        return sum;
    }

    public double minSalary(Employee[] emp){
        double min = emp[0].getSalary();
        for(int i=0; i<emp.length; i++){
            if(emp[i].getSalary()<min){
                min = emp[i].getSalary();
            }
        }
        return min;
    }

    public double maxSalary(Employee[] emp){
        double max = emp[0].getSalary();
        for(int i=0; i<emp.length; i++){
            if(emp[i].getSalary()>max){
                max = emp[i].getSalary();
            }
        }
        return max;
    }
    public int maxSubbordinates(Manager[] manager){
        int max = manager[0].getNumberOfSubbordinates();
        for(int i=0; i<manager.length; i++){
            if(manager[i].getNumberOfSubbordinates()>max){
                max = manager[i].getNumberOfSubbordinates();
            }
        }
        return max;

    }
    public double minSubbordinates(Manager[] manager){
        int min = manager[0].getNumberOfSubbordinates();
        for(int i=0; i<manager.length; i++){
            if(manager[i].getNumberOfSubbordinates()<min){
                min = manager[i].getNumberOfSubbordinates();
            }
        }
        return min;
    }
}
