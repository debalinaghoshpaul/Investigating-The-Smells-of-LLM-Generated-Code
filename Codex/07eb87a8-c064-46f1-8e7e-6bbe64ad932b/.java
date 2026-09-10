public class Doctor extends SalariedEmployee {
    private String specialty;
    private double officeVisitFee;

    public Doctor(String name, String address, String phoneNumber, String specialty, double officeVisitFee) {
        super(name, address, phoneNumber);
        this.specialty = specialty;
        this.officeVisitFee = officeVisitFee;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public double getOfficeVisitFee() {
        return officeVisitFee;
    }

    public void setOfficeVisitFee(double officeVisitFee) {
        this.officeVisitFee = officeVisitFee;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Doctor doctor = (Doctor) obj;
        return super.equals(doctor) && specialty.equals(doctor.specialty) && officeVisitFee == doctor.officeVisitFee;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", specialty='" + specialty + '\'' +
                ", officeVisitFee=" + officeVisitFee +
                '}';
    }

    // Test program
    public static void main(String[] args) {
        Doctor doctor = new Doctor("John Doe", "123 Main St", "555-1234", "Pediatrician", 50.0);
        System.out.println(doctor.toString());
    }
}
