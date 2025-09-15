package task2;

public class DataTypeLimits {
    public static void main(String[] args) {
        // Eksplorasi batas nilai untuk setiap tipe data
        System.out.println("=== BATAS NILAI TIPE DATA ===");

        // Byte
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Byte - Min: " + minByte + ", Max: " + maxByte);

        // TODO: Lakukan hal yang sama untuk short, int, long, float, double
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MIN_VALUE;
        System.out.println("Short - Min: " + minShort + ", Max: " + maxShort);

        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Integer - Min: " + minInt + ", Max: " + maxInt);

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("Long - Min: " + minLong + ", Max: " + maxLong);

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Float - Min: " + minFloat + ", Max: " + maxFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Double - Min: " + minDouble + ", Max: " + maxDouble);

        // Eksperimen: Coba assign nilai di luar batas
        // byte testByte = 200; // Uncomment dan lihat apa yang terjadi

        // Test dengan operasi yang menyebabkan overflow
        byte result = (byte)(maxByte + 1);
        System.out.println("Overflow byte: " + maxByte + " + 1 = " + result);

        short hasil= (short)(maxShort + 1);
        System.out.println("Overflow short: " + maxShort + " + 1 = " + hasil);

        byte tipe = (byte) 300;
        System.out.println(tipe);
    }
}

