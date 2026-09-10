class Administrator extends SalariedEmployee {
    private String title;
    private String areaOfResponsibility;
    private String supervisor;

    public Administrator(String name, String address, String phoneNumber, String socialSecurityNumber, double salary, String title, String areaOfResponsibility, String supervisor) {
        super(name, address, phoneNumber, socialSecurityNumber, salary);
        this.title = title;
        this.areaOfResponsibility = areaOfResponsibility;
        this.supervisor = supervisor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAreaOfResponsibility() {
        return areaOfResponsibility;
    }

    public void setAreaOfResponsibility(String areaOfResponsibility) {
        this.areaOfResponsibility = areaOfResponsibility;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public void readDataFromKeyboard() {
        // Implement code to read administrator's data from the keyboard
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Administrator admin = (Administrator) obj;
        // Implement code to compare administrator objects for equality
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "title='" + title + '\'' +
                ", areaOfResponsibility='" + areaOfResponsibility + '\'' +
                ", supervisor='" + supervisor + '\'' +
                '}';
    }
}

class SalariedEmployee {
    // Define the SalariedEmployee class here (you can use the code from Display 7.5)
}

public class Main {
    public static void main(String[] args) {
        // Write a suitable test program here
    }
}
