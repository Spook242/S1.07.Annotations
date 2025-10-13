package nivel1Ejercicio1;

public class InPersonWorker extends Worker {

    public static double gas = 100;

    public InPersonWorker(String name, String lastName, double priceHour) {
        super (name, lastName, priceHour);
    }

    @Override
    public double calculateSalary (int workingHours) {
        return (workingHours * priceHour) + gas;


    }


}
