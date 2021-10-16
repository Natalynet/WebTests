package Worker13;

class Manager extends Worker {
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

        if (getNumberOfSubbordinates() != 0) {
            return super.getSalary() * (getNumberOfSubbordinates() / 100.0 * 3);
        } else {
            return super.getSalary();
        }

    }
}
