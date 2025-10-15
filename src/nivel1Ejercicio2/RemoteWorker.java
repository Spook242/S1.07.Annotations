package nivel1Ejercicio2;

public class RemoteWorker extends Worker {

    private static final double INTERNET = 50.0;

    public RemoteWorker(String name, String lastName, double priceHour) {
        super(name, lastName, priceHour);
    }

    @Override
    public double calculateSalary(int workingHours) {
        return (workingHours * priceHour) + INTERNET;
    }

    @Deprecated
    public void oldConnection() {
        System.out.println(name + " Online worker with old connection.");
    }

    public void newConnexion() {
        System.out.println(name + " Online worker with new connection");
    }
}

