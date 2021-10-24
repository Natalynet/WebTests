
public interface IMonth {
    int getMonthWorkingDays(String month);

}
    class MonthHelper{
        String month;
        int days;
        int workingDays;

        MonthHelper(String month, int days, int workingDays) {
            this.month = month;
            this.days = days;
            this.workingDays = workingDays;

        }

    }


