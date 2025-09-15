package task2;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== KALKULATOR SEDERHANA ===");

        // Input dua angka
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        // Hitung dan tampilkan hasil operasi matematika
        // TODO: Implementasikan operasi berikut:
        double penjumlahan = angka1 + angka2;
        double pengurangan = angka1 - angka2;
        double perkalian = angka1 * angka2;
        double pembagian = angka1 / angka2;
        double modulus = angka1 % angka2;

        // - Pembagian (perhatikan pembagian dengan nol)
        // - Modulus/sisa bagi

        // Tampilkan hasil dengan format yang rapi
        System.out.println("\\n=== HASIL PERHITUNGAN ===");
        System.out.println("penjumlahan : " + angka1 + " + " + angka2 + " = " + penjumlahan);
        System.out.println("pengurangan : " + angka1 + " - " + angka2 + " = "  + pengurangan);
        System.out.println("perkalian : " + angka1 + " * " + angka2 + " = " + perkalian);
        System.out.println("pembagian double : " + angka1 + " / " + angka2 + " = " + pembagian);
        System.out.println("modulus : " + angka1 + " % " + angka2 + " = " + modulus);
        // Implementasi di sini...

        scanner.close();
    }
}
