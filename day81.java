public class day81 {
    public static void main(String[] args) {

        // Buat array nilai
        int[] nilai = {85, 90, 78, 88, 95};

        System.out.println("--- Data Nilai Awal ---");

        // Cetak siswa pertama
        System.out.println("Nilai Siswa Pertama: " + nilai[0]);

        // Cetak siswa terakhir
        System.out.println("Nilai Siswa Terakhir: " + nilai[4]);

        System.out.println("\n--- Update Data ---");

        // Nilai lama siswa ke-3
        System.out.println("Nilai lama siswa ke-3: " + nilai[2]);

        // Update nilai siswa ke-3
        nilai[2] = 100;

        // Cetak nilai baru
        System.out.println("Nilai baru siswa ke-3: " + nilai[2]);

        System.out.println("\n--- Operasi Matematika ---");

        // Rata-rata siswa 1 & 2
        double rata = (nilai[0] + nilai[1]) / 2.0;

        System.out.println("Rata-rata nilai Siswa 1 & 2: " + rata);
    }
}
