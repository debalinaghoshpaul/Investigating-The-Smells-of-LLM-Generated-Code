    private String name;
    private String dateOfBirth;
    private String dateOfDeath;

    public Person(String name, String dateOfBirth, String dateOfDeath) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        if(dateOfDeath != null && dateOfDeath.compareTo(dateOfBirth) < 0) {
            throw new IllegalArgumentException("Date of death cannot be before date of birth");
        }
        this.dateOfDeath = dateOfDeath;
    }

    // Getters and setters for name, dateOfBirth, and dateOfDeath

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(String dateOfDeath) {
        if(dateOfDeath != null && dateOfDeath.compareTo(dateOfBirth) < 0) {
            throw new IllegalArgumentException("Date of death cannot be before date of birth");
        }
        this.dateOfDeath = dateOfDeath;
    }
}
