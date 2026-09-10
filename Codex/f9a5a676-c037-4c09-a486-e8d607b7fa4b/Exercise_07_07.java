package chapter_seven;

/**
 * 7. Give the definition of two classes, Patient and Billing, whose objects are records
 * for a clinic. Patient will be derived from the class Person given in Programming
 * Project 7.6. A Patient record has the patient’s name (inherited from the class
 * Person) and primary physician of type Doctor defined in Programming Project 7.5
 * A Billing object will contain a Patient object, a Doctor object, and an amount
 * due of type double. Be sure your classes have a reasonable complement of constructors,
 * accessor and mutator methods, and suitably defined equals and toString
 * methods. First write a driver program to test all your methods, then write a test
 * program that creates at least two patients, at least two doctors, and at least two
 * Billing records, and then prints out the total income from the Billing records.
 *
 * @author Sharaf Qeshta
 * */


public class Exercise_07_07
{
    public static void main(String[] args)
    {
        Doctor doctor1 = new Doctor("Obstetrician", 50);
        Doctor doctor2 = new Doctor("General Practitioner", 80);

        Patient patient1 = new Patient("Sharaf Qeshta", doctor1);
        Patient patient2 = new Patient("John Smith", doctor2);

        Billing billing1 = new Billing(doctor1, patient1, 50);
        Billing billing2 = new Billing(doctor2, patient2, 80);


        /*
        * Person Name Sharaf Qeshta, Patient Doctor: No name January 1, 1000
        * $0.0 per year
        *   Speciality: Obstetrician
        *   Office Visit Fee: $50.0
        * */
        System.out.println(patient1);

        /*
        * Person Name John Smith, Patient Doctor: No name January 1, 1000
        * $0.0 per year
        *   Speciality: General Practitioner
        *   Office Visit Fee: $80.0
        * */
        System.out.println(patient2);


        System.out.println(billing1);
        System.out.println(billing2);

        System.out.println(billing1.equals(billing2)); // false
        System.out.println(patient1.equals(patient2)); // false

    }
}
package chapter_seven;

public class Billing
{
    private Doctor doctor;
    private Patient patient;
    private double fees;

    public Billing() {}

    public Billing(Doctor doctor,
                   Patient patient)
    {
        this.doctor = doctor;
        this.patient = patient;
    }


    public Billing(Patient patient)
    {
        this.patient = patient;
    }

    public Billing(Doctor doctor, Patient patient,
                   double fees)
    {
        this.doctor = doctor;
        this.patient = patient;
        this.fees = fees;
    }

    public Billing(Billing billing)
    {
        this.doctor = billing.getDoctor();
        this.patient = billing.getPatient();
        this.fees = billing.getFees();
    }


    public Doctor getDoctor()
    {
        return doctor;
    }

    public void setDoctor(Doctor doctor)
    {
        this.doctor = doctor;
    }

    public Patient getPatient()
    {
        return patient;
    }

    public void setPatient(Patient patient)
    {
        this.patient = patient;
    }

    public double getFees()
    {
        return fees;
    }

    public void setFees(double fees)
    {
        this.fees = fees;
    }


    public String toString()
    {
        return doctor.toString() + patient.toString() + ", Fees: $" + fees;
    }

    public boolean equals(Billing other)
    {
        return doctor.equals(other.getDoctor())
                && patient.equals(other.getPatient())
                && fees == other.getFees();
    }
}
package chapter_seven;

public class Doctor extends SalariedEmployee
{
    private String specialty;
    private double officeVisitFee;

    public Doctor(String specialty,
                  double officeVisitFee)
    {
        this.specialty = specialty;
        this.officeVisitFee = officeVisitFee;
    }

    public Doctor(String theName, Date theDate,
                  double theSalary, String specialty,
                  double officeVisitFee)
    {
        super(theName, theDate, theSalary);
        this.specialty = specialty;
        this.officeVisitFee = officeVisitFee;
    }


    public Doctor(SalariedEmployee originalObject,
                  String specialty, double officeVisitFee)
    {
        super(originalObject);
        this.specialty = specialty;
        this.officeVisitFee = officeVisitFee;
    }

    public String getSpecialty()
    {
        return specialty;
    }

    public void setSpecialty(String specialty)
    {
        this.specialty = specialty;
    }

    public double getOfficeVisitFee()
    {
        return officeVisitFee;
    }

    public void setOfficeVisitFee(double officeVisitFee)
    {
        this.officeVisitFee = officeVisitFee;
    }

    public boolean equals(Doctor other)
    {
        return super.equals(other)
                && getSpecialty().equals(other.getSpecialty())
                && getOfficeVisitFee() == other.getOfficeVisitFee();
    }


    public String toString()
    {
        return super.toString()
                + "\n Speciality: " + getSpecialty()
                + "\n Office Visit Fee: $" + getOfficeVisitFee();
    }
}
package chapter_seven;

public class Patient extends Person
{
    private Doctor doctor;

    public Patient(String name,
                   Doctor doctor)
    {
        super(name);
        this.doctor = doctor;
    }

    public Patient(Person person,
                   Doctor doctor)
    {
        super(person);
        this.doctor = doctor;
    }


    public Doctor getDoctor()
    {
        return doctor;
    }

    public void setDoctor(Doctor doctor)
    {
        this.doctor = doctor;
    }

    public String toString()
    {
        return super.toString() + ", Patient Doctor: " + doctor.toString();
    }

    public boolean equals(Patient other)
    {
        return super.equals(other)
                && doctor.equals(other.doctor);
    }
}
package chapter_seven;

public class Person
{
    String name;

    public Person()
    {
        name = "No Name Yet";
    }

    public Person(String name)
    {
        this.name = name;
    }

    public Person(Person person)
    {
        this.name = person.getName();
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    public String toString()
    {
        return "Person Name " + name;
    }


    public boolean equals(Person other)
    {
        return name.equals(other.getName());
    }
}
