// NationalCall class
class NationalCall {
    private String sourcePhoneNumber;
    private String destinationPhoneNumber;
    private int totalDurationCurrentCall;
    private int totalDurationAllCalls;
    private double currentCallPrice;
    private double totalPriceAllCalls;

    // Constructor
    public NationalCall(String sourcePhoneNumber, String destinationPhoneNumber, int totalDurationCurrentCall) {
        this.sourcePhoneNumber = sourcePhoneNumber;
        this.destinationPhoneNumber = destinationPhoneNumber;
        this.totalDurationCurrentCall = totalDurationCurrentCall;
        this.totalDurationAllCalls = 0;
        this.currentCallPrice = 0.0;
        this.totalPriceAllCalls = 0.0;
    }

    // Getter and setter methods

    // Method to calculate call price
    public void calculateCallPrice() {
        if(totalDurationCurrentCall <= 60) {
            currentCallPrice = 0.20;
        } else if(totalDurationCurrentCall <= 120) {
            currentCallPrice = 0.20 + 0.15;
        } else {
            currentCallPrice = 0.20 + 0.15 + 0.10;
        }
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Source Phone Number: " + sourcePhoneNumber);
        System.out.println("Destination Phone Number: " + destinationPhoneNumber);
        System.out.println("Total Duration of Current Call: " + totalDurationCurrentCall + " seconds");
        System.out.println("Total Price of Current Call: $" + currentCallPrice);
        System.out.println("Total Price of All Calls: $" + totalPriceAllCalls);
    }
}

// InternationalCall class
class InternationalCall extends NationalCall {
    private int sourceCountryCode;
    private int destinationCountryCode;

    // Constructor
    public InternationalCall(String sourcePhoneNumber, String destinationPhoneNumber, int totalDurationCurrentCall, int countryCode1, int countryCode2) {
        super(sourcePhoneNumber, destinationPhoneNumber, totalDurationCurrentCall);
        this.sourceCountryCode = countryCode1;
        this.destinationCountryCode = countryCode2;
    }

    // Method to calculate discount
    public void discountCall() {
        if(totalDurationAllCalls <= 600) {
            currentCallPrice -= currentCallPrice * 0.05;
        } else if(totalDurationAllCalls <= 1200) {
            currentCallPrice -= currentCallPrice * 0.07;
        } else {
            currentCallPrice -= currentCallPrice * 0.10;
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Testing NationalCall class
        NationalCall nationalCall = new NationalCall("1234567890", "9876543210", 90);
        nationalCall.calculateCallPrice();
        nationalCall.displayDetails();

        // Testing InternationalCall class
        InternationalCall internationalCall = new InternationalCall("1234567890", "9876543210", 150, 1, 2);
        internationalCall.calculateCallPrice();
        internationalCall.discountCall();
        internationalCall.displayDetails();
    }
}
