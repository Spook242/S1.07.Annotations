package nivel1Ejercicio2;

public class OfficeWorker extends Worker {

    public static double gas = 100;

    public OfficeWorker(String name, String lastName, double priceHour) {
        super (name, lastName, priceHour);
    }

    @Override
    public double calculateSalary (int workingHours) {
        return (workingHours * priceHour) + gas;
    }

    @Deprecated
    public void dieselGas() {
        System.out.println(name + " Online worker uses diesel gasoline.");
    }

    public void superGas() {
        System.out.println(name + " Online worker uses súper gasoline.");
    }

}
