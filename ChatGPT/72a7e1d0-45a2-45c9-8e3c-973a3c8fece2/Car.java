public class Car {
    private String company_name;
    private String model_name;
    private int year;
    private int mileage;
    
    public String getCompany_name() {
        return company_name;
    }
    
    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
    
    public String getModel_name() {
        return model_name;
    }
    
    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public int getMileage() {
        return mileage;
    }
    
    // Constructor
    public Car(String company_name, String model_name, int year, int mileage) {
        this.company_name = company_name;
        this.model_name = model_name;
        this.year = year;
        this.mileage = mileage;
    }
    
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2020, 50000);
        
        System.out.println("Company Name: " + myCar.getCompany_name());
        System.out.println("Model Name: " + myCar.getModel_name());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Mileage: " + myCar.getMileage());
    }
}
