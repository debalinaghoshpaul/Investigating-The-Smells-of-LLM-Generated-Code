import java.util.Arrays;

public class RemoveLeadingZerosFromIPAddress {

    public static void main(String[] args) {
        String[] ipAddresses = {
                "000.000.000.000",
                "192.168.1.1",
                "10.0.0.1",
                "0.0.0.0"
        };

        for (String ipAddress : ipAddresses) {
            System.out.println("Original IP Address: " + ipAddress);
            System.out.println("IP Address without leading zeros: " + removeLeadingZeros(ipAddress));
            System.out.println();
        }
    }

    public static String removeLeadingZeros(String ipAddress) {
        String[] octets = ipAddress.split("\\.");

        for (int i = 0; i < octets.length; i++) {
            octets[i] = octets[i].replaceFirst("^0+(?!$)", "");
        }

        return String.join(".", octets);
    }
}
