public class Car {
    private String company_name;
    private String model_name;
    private int year;
    private int mileage;

    public Car(String company_name, String model_name, int year, int mileage) {
        this.company_name = company_name;
        this.model_name = model_name;
        this.year = year;
        this.mileage = mileage;
    }

    public String getCompanyName() {
        return company_name;
    }

    public void setCompanyName(String company_name) {
        this.company_name = company_name;
    }

    public String getModelName() {
        return model_name;
    }

    public void setModelName(String model_name) {
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

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Mustang", 2020, 10000);
        car.setCompanyName("Ford");
        car.setModelName("Mustang");
        car.setYear(2020);
        car.setMileage(10000);

        System.out.println(car.getCompanyName());
        System.out.println(car.getModelName());
        System.out.println(car.getYear());
        System.out.println(car.getMileage());
    }
}

