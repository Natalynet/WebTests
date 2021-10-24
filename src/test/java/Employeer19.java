public class Employeer19{
   private String name;
   private int age;
    private String sex;
    private double daySalary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public double daySalary() {
        return daySalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDaySalary(double salary) {
        this.daySalary = salary;
    }
    public double getMonthSalary(Employeer19[] array, IMonth o, String month) {
        double result = 0;
        for(int i = 0; i< array.length; i++){
            result += array[i].daySalary * o.getMonthWorkingDays(month);
        }
        return result;
    }



}
