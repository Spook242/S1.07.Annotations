package nivel1Ejercicio2;

public class Worker {

    protected String name;
    protected String lastName;
    protected double priceHour;


    public Worker (String name, String lastName, double priceHour) {
        this.name = name;
        this.lastName = lastName;
        this.priceHour = priceHour;
    }

    public double calculateSalary (int workingHours) {
        return workingHours * priceHour;
    }
    @Override
    public String toString() {
        return name + " " + lastName + " " + priceHour + " € / hour.";
    }
}



