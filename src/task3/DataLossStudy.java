package task3;

public class DataLossStudy {
    public static void main(String[] args) {
        System.out.println("=== STUDI KASUS DATA LOSS ===");

        // Kasus 1: Sistem Penilaian
        System.out.println("1. Sistem Penilaian:");
        double nilaiAsli = 87.65;
        int nilaiHuruf = (int) nilaiAsli; // Data loss!

        System.out.println("Nilai asli: " + nilaiAsli);
        System.out.println("Nilai setelah casting ke int: " + nilaiHuruf);
        System.out.println("Data yang hilang: " + (nilaiAsli - nilaiHuruf));

        // Kasus 2: Populasi Negara
        System.out.println("\n2. Data Populasi:");
        long populasiIndonesia = 273_523_615L; // 273 juta+
        int populasiInt = (int) populasiIndonesia; // Overflow!

        System.out.println("Populasi asli (long): " + populasiIndonesia);
        System.out.println("Populasi setelah casting ke int: " + populasiInt);

        // Kasus 3: Konversi Mata Uang
        System.out.println("\n3. Konversi Mata Uang:");
        double rupiah = 1_000_000.75; //
        int dollar = (int) (rupiah / 16_000);
        System.out.println("Rupiah asli: " + rupiah);
        System.out.println("Hasil konversi ke dollar (dibulatkan ke bawah): " + dollar);

        // Kasus 4: Pengukuran Jarak GPS
        System.out.println("\n4. Pengukuran Jarak GPS:");
        double jarakAsli = 12345.678901;
        float jarakFloat = (float) jarakAsli;
        System.out.println("Jarak asli (double): " + jarakAsli);
        System.out.println("Jarak setelah casting ke float: " + jarakFloat);

        // Kasus 5: Perhitungan Waktu
        System.out.println("\n5. Perhitungan Waktu:");
        long waktuMillis = System.currentTimeMillis();
        int waktuInt = (int) waktuMillis;
        System.out.println("Waktu asli (long): " + waktuMillis);
        System.out.println("Waktu setelah casting ke int: " + waktuInt);
    }
}


