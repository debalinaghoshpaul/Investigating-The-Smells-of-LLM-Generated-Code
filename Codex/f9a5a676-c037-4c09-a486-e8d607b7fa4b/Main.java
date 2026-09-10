class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Patient extends Person {
    private Doctor primaryPhysician;

    public Patient(String name, Doctor primaryPhysician) {
        super(name);
        this.primaryPhysician = primaryPhysician;
    }

    public Doctor getPrimaryPhysician() {
        return primaryPhysician;
    }
}

class Billing {
    private Patient patient;
    private Doctor doctor;
    private double amountDue;

    public Billing(Patient patient, Doctor doctor, double amountDue) {
        this.patient = patient;
        this.doctor = doctor;
        this.amountDue = amountDue;
    }

    public double getAmountDue() {
        return amountDue;
    }

    @Override
    public String toString() {
        return "Billing{" +
                "patient=" + patient.getName() +
                ", doctor=" + doctor.getName() +
                ", amountDue=" + amountDue +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Test your methods here
        Doctor doctor1 = new Doctor("Dr. Smith");
        Doctor doctor2 = new Doctor("Dr. Johnson");

        Patient patient1 = new Patient("John Doe", doctor1);
        Patient patient2 = new Patient("Jane Smith", doctor2);

        Billing billing1 = new Billing(patient1, doctor1, 100.0);
        Billing billing2 = new Billing(patient2, doctor2, 200.0);

        System.out.println(billing1);
        System.out.println(billing2);

        double totalIncome = billing1.getAmountDue() + billing2.getAmountDue();
        System.out.println("Total income: $" + totalIncome);
    }
}
