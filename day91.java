public class day91 {

    // Method untuk menghitung dan mencetak gaji
    public static void hitungGaji(String nama, int jumlahJamKerja) {
        int totalGaji = jumlahJamKerja * 50000;
        System.out.println("Karyawan " + nama +
                           " bekerja " + jumlahJamKerja +
                           " jam, mendapatkan gaji Rp " + totalGaji);
    }

    public static void main(String[] args) {
        // Pemanggilan method dengan 2 data berbeda
        hitungGaji("Aika", 5);
        hitungGaji("Kayla", 8);
    }
}
