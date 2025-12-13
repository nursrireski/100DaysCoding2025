import java.util.Scanner;

public class day97 {

    // Method non-void untuk menghitung luas persegi
    static int hitungLuasPersegi(int sisi) {
        return sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Program Hitung Luas Persegi ---");
        System.out.print("Masukkan panjang sisi: ");
        int sisi = input.nextInt();

        // Memanggil method dan menyimpan hasilnya
        int luas = hitungLuasPersegi(sisi);

        // Menampilkan hasil
        System.out.println("\nLuas Persegi dengan sisi " + sisi + " adalah: " + luas);
    }
}
