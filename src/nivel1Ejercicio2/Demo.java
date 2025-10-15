package nivel1Ejercicio2;

public class Demo {

    Worker worker = new Worker("Tony", "Montana", 15.5);
    RemoteWorker remoteWorker = new RemoteWorker("Antoñito", "Smith", 23.0);
    OfficeWorker officeWorker = new OfficeWorker("Anthony", "De La Vega", 19.85);

    int hours = 175;

    public void showSalaries() {

        System.out.println("Salary for " + worker + ": " + worker.calculateSalary(hours) + " €.");
        System.out.println("Salary for " + remoteWorker + ": " + remoteWorker.calculateSalary(hours) + " €.");
        System.out.println("Salary for " + officeWorker + ": " + officeWorker.calculateSalary(hours) + " €.");

        remoteWorker.newConnexion();
        officeWorker.superGas();

        remoteWorker.oldConnection();
        officeWorker.dieselGas();
    }
}
