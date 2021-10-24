
public interface IMonth {
    double getMonthWorkingDays(MonthImpl m);

}
    class MonthImpl implements IMonth{
        String month;
        int days;
        int workingDays;

    MonthImpl(String month, int days, int workingDays){
        this.month = month;
        this.days = days;
        this.workingDays = workingDays;

    }


        IMonth January = new MonthImpl("January", 31, 21);
        IMonth February = new MonthImpl("February", 28, 20);
        IMonth March = new MonthImpl("March", 31, 23);
        IMonth April = new MonthImpl("April", 30, 21);
        IMonth May = new MonthImpl("May", 31, 22);
        IMonth June = new MonthImpl("June", 30, 22);
        IMonth July = new MonthImpl("July", 31, 21);
        IMonth August = new MonthImpl("August", 31, 23);
        IMonth September = new MonthImpl("January", 30, 22);
        IMonth October = new MonthImpl("October", 31, 21);
        IMonth November = new MonthImpl("October", 30, 22);
        IMonth December = new MonthImpl("October", 31, 22);

        public IMonth[] months = {January, February, March, April, May, June, July, August, September, October, November, December};

        public double getMonthWorkingDays(MonthImpl m){
            return m.workingDays;
        }

}
