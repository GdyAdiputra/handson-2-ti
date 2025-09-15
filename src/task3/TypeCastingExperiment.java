package task3;

public class TypeCastingExperiment {
    public static void main(String[] args) {
        System.out.println("=== EKSPERIMEN TYPE CASTING ===");

        // 1. Implicit Casting (Widening)
        int intValue = 100;
        long longValue = intValue; // Automatic conversion
        double doubleValue = longValue; // Automatic conversion

        System.out.println("Implicit Casting:");
        System.out.println("int: " + intValue + " -> long: " + longValue + " -> double: " + doubleValue);

        // 2. Explicit Casting (Narrowing) - Tanpa Data Loss
        double preciseValue = 123.0;
        int convertedInt = (int) preciseValue;

        System.out.println("\\nExplicit Casting (no data loss):");
        System.out.println("double: " + preciseValue + " -> int: " + convertedInt);

        // 3. Explicit Casting - Dengan Data Loss
        double decimalValue = 123.789;
        int truncatedInt = (int) decimalValue;

        System.out.println("\\nExplicit Casting (with data loss):");
        System.out.println("double: " + decimalValue + " -> int: " + truncatedInt);

        // 4. Overflow Example
        int largeInt = 300;
        byte overflowByte = (byte) largeInt;

        System.out.println("\\nOverflow Example:");
        System.out.println("int: " + largeInt + " -> byte: " + overflowByte);

        // TODO: Eksperimen dengan kasus-kasus berikut:
        // - Convert long ke int dengan nilai besar
        // - Convert float ke int
        // - Convert double ke float
        // Analisis kapan terjadi data loss dan kapan tidak

        long longValues =  10000;
        int intValues = (int) longValues;

        System.out.println("\\nExplicit Casting (no data loss):");
        System.out.println("long value : " +  longValues + " int value : " + intValues);

        float floatValues = 12.345f;
        int intvalues = (int) floatValues;

        System.out.println("\\nExplicit Casting (with data loss):");
        System.out.println("float value : " + floatValues + " int value : " + intvalues);

        double doubleValues = 3000.250;
        float floatvalues = (float) doubleValues;

        System.out.println("\\nExplicit Casting (no data loss):");
        System.out.println("double : " + doubleValues + " float : " + floatvalues);
    }
}

