import java.util.Scanner;

public class day42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Program Hitung Gaji Bersih (PPh 21 Sederhana) ---");
        System.out.print("Masukkan Gaji Kotor Bulanan: ");
        double gajiKotor = input.nextDouble();

        // 1. Hitung Biaya Jabatan (5% dari gaji kotor, maksimal 500.000)
        double biayaJabatan = gajiKotor * 0.05;
        if (biayaJabatan > 500000) {
            biayaJabatan = 500000;
        }

        // 2. Penghasilan Neto Bulanan dan Tahunan
        double penghasilanNetoBulanan = gajiKotor - biayaJabatan;
        double penghasilanNetoTahunan = penghasilanNetoBulanan * 12;

        // 3. PTKP untuk TK/0
        double ptkp = 54000000;

        // 4. Penghasilan Kena Pajak (PKP)
        double pkp = penghasilanNetoTahunan - ptkp;
        if (pkp < 0) pkp = 0;

        // 5. Hitung Pajak Progresif
        double pph21Tahunan = 0;
        if (pkp <= 60000000) {
            pph21Tahunan = pkp * 0.05;
        } else if (pkp <= 250000000) {
            pph21Tahunan = (60000000 * 0.05) + ((pkp - 60000000) * 0.15);
        } else if (pkp <= 500000000) {
            pph21Tahunan = (60000000 * 0.05) + (190000000 * 0.15) + ((pkp - 250000000) * 0.25);
        } else if (pkp <= 5000000000L) {
            pph21Tahunan = (60000000 * 0.05) + (190000000 * 0.15)
                         + (250000000 * 0.25) + ((pkp - 500000000) * 0.30);
        } else {
            pph21Tahunan = (60000000 * 0.05) + (190000000 * 0.15)
                         + (250000000 * 0.25) + (4500000000L * 0.30)
                         + ((pkp - 5000000000L) * 0.35);
        }

        // 6. Pajak & Gaji Bersih Bulanan
        double pph21Bulanan = pph21Tahunan / 12;
        double gajiBersih = penghasilanNetoBulanan - pph21Bulanan;

        // 7. Cetak hasil
        System.out.println("\n--- Rincian Perhitungan ---");
        System.out.printf("Gaji Kotor Bulanan        : Rp %, .2f%n", gajiKotor);
        System.out.printf("Biaya Jabatan (5%%, maks 500rb): Rp %, .2f%n", biayaJabatan);
        System.out.printf("Penghasilan Neto Bulanan  : Rp %, .2f%n", penghasilanNetoBulanan);
        System.out.printf("Penghasilan Neto Tahunan  : Rp %, .2f%n", penghasilanNetoTahunan);
        System.out.printf("PTKP (TK/0) Tahunan       : Rp %, .2f%n", ptkp);
        System.out.printf("Penghasilan Kena Pajak    : Rp %, .2f%n", pkp);
        System.out.printf("PPh 21 Tahunan            : Rp %, .2f%n", pph21Tahunan);
        System.out.printf("PPh 21 Bulanan            : Rp %, .2f%n", pph21Bulanan);
        System.out.println("--------------------------------------------------");
        System.out.printf("Gaji Bersih Bulanan       : Rp %, .2f%n", gajiBersih);
    }
}