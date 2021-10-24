public class MonthImpl implements IMonth{
    MonthHelper January = new MonthHelper("January", 31, 21);
    MonthHelper February = new MonthHelper("February", 28, 20);
    MonthHelper March = new MonthHelper("March", 31, 23);
    MonthHelper April = new MonthHelper("April", 30, 21);
    MonthHelper May = new MonthHelper("May", 31, 22);
    MonthHelper June = new MonthHelper("June", 30, 22);
    MonthHelper July = new MonthHelper("July", 31, 21);
    MonthHelper August = new MonthHelper("August", 31, 23);
    MonthHelper September = new MonthHelper("January", 30, 22);
    MonthHelper October = new MonthHelper("October", 31, 21);
    MonthHelper November = new MonthHelper("November", 30, 22);
    MonthHelper December = new MonthHelper("December", 31, 22);

    public MonthHelper[] months = {January, February, March, April, May, June, July, August, September, October, November, December};

    public int getMonthWorkingDays(String month) {
        for(int i=1; i<months.length; i++){
            if(months[i].month.equals(month)){
                return months[i].workingDays;
            }
        }
        return -1;
    }
}
