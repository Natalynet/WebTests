package Task17;

public class Main17 {
    public static void main(String[] args) {

        Manager17 manager17 = new Manager17("Rob", 25, "Male", 1, 15);
        Month17 [] array = {MonthUnits17.February, MonthUnits17.March};
        System.out.println(manager17.getSalary(array));
    }
}
