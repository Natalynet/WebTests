package Task1111;

public class Month {
    String month;
    int days;
    int workingDays;

    Month(String month, int days, int workingDays){
        this.month = month;
        this.days = days;
        this.workingDays = workingDays;
    }

}
 class MonthUnits{

     Month January = new Month("January", 31, 21);
     Month February = new Month("February", 28, 20);
     Month March = new Month("March", 31, 23);
     Month April = new Month("April", 30, 21);
     Month May = new Month("May", 31, 22);
     Month June = new Month("June", 30, 22);
     Month July = new Month("July", 31, 21);
     Month August = new Month("August", 31, 23);
     Month September = new Month("January", 30, 22);
     Month October = new Month("October", 31, 21);
     Month November = new Month("October", 30, 22);
     Month December = new Month("October", 31, 22);

     public Month[] months = {January, February, March, April, May, June, July, August, September, October, November, December};

    }
