public class day20 {
    public static void main(String[] args) {
        // Data karyawan
        int tahunMasuk = 2025;   // contoh tahun masuk
        int nomorUrut = 7;       // contoh nomor urut

        // Konversi int ke String dan gabungkan
        String idKaryawan = "KRY-" + Integer.toString(tahunMasuk) + "-" + Integer.toString(nomorUrut);

        // Cetak ID karyawan
        System.out.println("ID Karyawan: " + idKaryawan);
    }
}