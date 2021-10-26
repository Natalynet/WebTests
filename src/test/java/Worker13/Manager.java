package Worker13;

public final class Manager extends Worker {
    private int numberOfSubbordinates;

    Manager(String name, double baseSalary, int numberOfSubbordinates) {
        super(name, baseSalary);
        this.numberOfSubbordinates = numberOfSubbordinates;
    }

    public void setNumberOfSubbordinates(int numberOfSubbordinates) {
        this.numberOfSubbordinates = numberOfSubbordinates;
    }

    public int getNumberOfSubbordinates() {
        return numberOfSubbordinates;
    }

    @Override
    public double getSalary() {

        final double percent = 100.0;
        final double percentForWorker = 3;
        if (getNumberOfSubbordinates() != 0) {
            return super.getSalary() * (getNumberOfSubbordinates() / percent * percentForWorker);
        } else {
            return super.getSalary();
        }

    }
}
