package Task172;

public class UtilClass {
    public IEmployee findEmployeeByName (IEmployee[] array, String name){
        for(int i=0; i<array.length; i++){
            if(array[i].getName().equals(name)){
                return array[i];

            }
        }
        return null;
    }

    public IEmployee nameContains (IEmployee[] array, String a){
        for(int i=0; i<array.length; i++){
            if((array[i].getName()).contains(a)){
                return array[i];
            }
        }
        return null;
    }

    public double allSalary(IEmployee[] array){
        double sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i].getSalary();
        }
        return sum;
    }

    public double minSalary(IEmployee[] emp){
        double min = emp[0].getSalary();
        for(int i=1; i<emp.length; i++){
            if(emp[i].getSalary()<min){
                min = emp[i].getSalary();
            }
        }
        return min;
    }

    public double maxSalary(IEmployee[] emp){
        double max = emp[0].getSalary();
        for(int i=1; i<emp.length; i++){
            if(emp[i].getSalary()>max){
                max = emp[i].getSalary();
            }
        }
        return max;
    }
    public int maxSubbordinates(IManager[] manager){
        int max = manager[0].getNumberOfSubordinates();
        for(int i=1; i<manager.length; i++){
            if(manager[i].getNumberOfSubordinates()>max){
                max = manager[i].getNumberOfSubordinates();
            }
        }
        return max;

    }
    public double minSubbordinates(IManager[] manager){
        int min = manager[0].getNumberOfSubordinates();
        for(int i=1; i<manager.length; i++){
            if(manager[i].getNumberOfSubordinates()<min){
                min = manager[i].getNumberOfSubordinates();
            }
        }
        return min;
    }

    public double minIncrease (Worker[] workers){
        double min = workers[0].getSalary()-workers[0].getBaseSalary();
        for(int i=1; i<workers.length; i++){
            if(workers[i].getSalary()-workers[i].getBaseSalary()<min){
                min = workers[i].getSalary()-workers[i].getBaseSalary();
            }
        }
        return min;
    }
    public double maxIncrease (Worker[] workers){
        double max = workers[0].getSalary()-workers[0].getBaseSalary();
        for(int i=1; i<workers.length; i++){
            if(workers[i].getSalary()-workers[i].getBaseSalary()>max){
                max = workers[i].getSalary()-workers[i].getBaseSalary();
            }
        }
        return max;
    }
}
