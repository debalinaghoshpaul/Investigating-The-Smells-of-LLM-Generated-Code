import java.util.ArrayList;
import java.util.List;

public class CharacterSet {
    public static void main(String[] args) {
        List<String> availableCharsets = new ArrayList<>();
        availableCharsets.add("Big5");
        availableCharsets.add("Big5-HKSCS");
        availableCharsets.add("CESU-8");
        availableCharsets.add("EUC-JP");
        availableCharsets.add("EUC-KR");
        availableCharsets.add("GB18030");
        availableCharsets.add("GB2312");
        availableCharsets.add("GBK");
        availableCharsets.add("x-SJIS_0213");
        availableCharsets.add("x-UTF-16LE-BOM");
        availableCharsets.add("x-UTF-32BE-BOM");
        availableCharsets.add("x-UTF-32LE-BOM");
        availableCharsets.add("x-windows-50220");
        availableCharsets.add("x-windows-50221");
        availableCharsets.add("x-windows-874");
        availableCharsets.add("x-windows-949");
        availableCharsets.add("x-windows-iso2022jp");
        System.out.println(availableCharsets);
    }
}

