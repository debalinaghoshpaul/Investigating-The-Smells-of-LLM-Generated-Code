// Encryptable interface
interface Encryptable {
    String encrypt(String data);
    String decrypt(String encryptedData);
}

// AES class implementing Encryptable interface
class AES implements Encryptable {
    @Override
    public String encrypt(String data) {
        // AES encryption algorithm implementation here
        return "AES Encrypted: " + data;
    }

    @Override
    public String decrypt(String encryptedData) {
        // AES decryption algorithm implementation here
        return "AES Decrypted: " + encryptedData;
    }
}

// RSA class implementing Encryptable interface
class RSA implements Encryptable {
    @Override
    public String encrypt(String data) {
        // RSA encryption algorithm implementation here
        return "RSA Encrypted: " + data;
    }

    @Override
    public String decrypt(String encryptedData) {
        // RSA decryption algorithm implementation here
        return "RSA Decrypted: " + encryptedData;
    }
}

public class Main {
    public static void main(String[] args) {
        AES aes = new AES();
        RSA rsa = new RSA();

        String data = "Hello, World!";

        String aesEncryptedData = aes.encrypt(data);
        String aesDecryptedData = aes.decrypt(aesEncryptedData);

        String rsaEncryptedData = rsa.encrypt(data);
        String rsaDecryptedData = rsa.decrypt(rsaEncryptedData);

        System.out.println(aesEncryptedData);
        System.out.println(aesDecryptedData);
        System.out.println(rsaEncryptedData);
        System.out.println(rsaDecryptedData);
    }
}
