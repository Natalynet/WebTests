package Task17;

public final class Month17 {
    private String month;
    private int days;
    private int workingDays;

    Month17(String month, int days, int workingDays){
        this.month = month;
        this.days = days;
        this.workingDays = workingDays;
    }

    public int getWorkingDays(){
        return workingDays;
    }


}
class MonthUnits17{

    static final Month17 January = new Month17("January", 31, 21);
    static final Month17 February = new Month17("February", 28, 20);
    static final Month17 March = new Month17("March", 31, 23);
    static final Month17 April = new Month17("April", 30, 21);
    static final Month17 May = new Month17("May", 31, 22);
    static final Month17 June = new Month17("June", 30, 22);
    static final Month17 July = new Month17("July", 31, 21);
    static final Month17 August = new Month17("August", 31, 23);
    static final Month17 September = new Month17("January", 30, 22);
    static final Month17 October = new Month17("October", 31, 21);
    static final Month17 November = new Month17("October", 30, 22);
    static final Month17 December = new Month17("October", 31, 22);

    public static Month17[] months = {January, February, March, April, May, June, July, August, September, October, November, December};

}
