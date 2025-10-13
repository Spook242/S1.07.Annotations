package nivel1Ejercicio1;

public class Main {

    public static void main(String[] args) {

        Worker w = new Worker("Tony", "Montana", 15.5);
        OnlineWorker olw = new OnlineWorker("Antoñito", "Smith", 23.0);
        InPersonWorker ipw = new InPersonWorker("Anthony", "De La Vega", 19.85);

        int hours = 175;

        System.out.println("Salary for " + w + ": " + w.calculateSalary(hours) + " €.");
        System.out.println("Salary for " + olw + ": " + olw.calculateSalary(hours) + " €.");
        System.out.println("Salary for " + ipw + ": " + ipw.calculateSalary(hours) + " €.");
        }

    }

