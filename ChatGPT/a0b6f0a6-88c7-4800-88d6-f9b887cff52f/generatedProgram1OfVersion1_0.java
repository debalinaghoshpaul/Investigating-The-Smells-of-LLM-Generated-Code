public class Temperature {
    private double value;
    private char scale;

    public Temperature() {
        this.value = 0.0;
        this.scale = 'C';
    }

    public Temperature(double value) {
        this.value = value;
        this.scale = 'C';
    }

    public Temperature(char scale) {
        this.value = 0.0;
        this.scale = scale;
    }

    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public double getDegreesCelsius() {
        if (scale == 'F') {
            return Math.round((5.0 / 9.0 * (value - 32)) * 10) / 10.0;
        } else {
            return value;
        }
    }

    public double getDegreesFahrenheit() {
        if (scale == 'C') {
            return Math.round(((9.0 / 5.0 * value) + 32) * 10) / 10.0;
        } else {
            return value;
        }
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setBoth(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public boolean equals(Temperature otherTemp) {
        return this.getDegreesCelsius() == otherTemp.getDegreesCelsius();
    }

    public boolean greaterThan(Temperature otherTemp) {
        return this.getDegreesCelsius() > otherTemp.getDegreesCelsius();
    }

    public boolean lessThan(Temperature otherTemp) {
        return this.getDegreesCelsius() < otherTemp.getDegreesCelsius();
    }

    @Override
    public String toString() {
        return String.format("%.1f degrees %c", value, scale);
    }

    public static void main(String[] args) {
        Temperature temp1 = new Temperature();
        Temperature temp2 = new Temperature(32,'F');
        Temperature temp3 = new Temperature(-40,'C');
        Temperature temp4 = new Temperature(-40,'F');
        Temperature temp5 = new Temperature(100,'C');
        Temperature temp6 = new Temperature(212,'F');

        System.out.println("Temperature 1: " + temp1);
        System.out.println("Temperature 2: " + temp2);
        System.out.println("Temperature 3: " + temp3);
        System.out.println("Temperature 4: " + temp4);
        System.out.println("Temperature 5: " + temp5);
        System.out.println("Temperature 6: " + temp6);

        System.out.println("Temperature 1 equals Temperature 2: " + temp1.equals(temp2));
        System.out.println("Temperature 3 equals Temperature 4: " + temp3.equals(temp4));
        System.out.println("Temperature 5 equals Temperature 6: " + temp5.equals(temp6));

        System.out.println("Temperature 1 greater than Temperature 3: " + temp1.greaterThan(temp3));
        System.out.println("Temperature 5 less than Temperature 6: " + temp5.lessThan(temp6));
    }
}
