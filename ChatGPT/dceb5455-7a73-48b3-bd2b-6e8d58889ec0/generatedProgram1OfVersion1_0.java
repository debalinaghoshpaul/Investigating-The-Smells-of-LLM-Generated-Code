import java.util.zip.CRC32;

public class CRCCalculator {
    
    public static String calculateCRC(byte[] data) {
        CRC32 crc = new CRC32();
        crc.update(data);
        long crcValue = crc.getValue();
        return Long.toHexString(crcValue);
    }
    
    public static void main(String[] args) {
        String data = "Hello, World!";
        byte[] dataBytes = data.getBytes();
        
        String crcValue = calculateCRC(dataBytes);
        
        System.out.println("Data: " + data);
        System.out.println("CRC Value: " + crcValue);
    }
}
