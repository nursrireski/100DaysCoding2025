import java.util.Scanner;

// Class day96
class day96 {

    // Method tambah
    public int tambah(int a, int b) {
        return a + b;
    }

    // Method kurang
    public int kurang(int a, int b) {
        return a - b;
    }

    // Method kali
    public int kali(int a, int b) {
        return a * b;
    }

    // Method bagi (return type: double)
    public double bagi(int a, int b) {
        return (double) a / b; // casting biar hasilnya desimal
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input user
        System.out.print("Masukkan Angka 1: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan Angka 2: ");
        int angka2 = input.nextInt();

        // Buat objek 
        day96 k = new day96();

        // Panggil method dan tampung hasil
        int hasilTambah = k.tambah(angka1, angka2);
        int hasilKurang = k.kurang(angka1, angka2);
        int hasilKali = k.kali(angka1, angka2);
        double hasilBagi = k.bagi(angka1, angka2);

        // Tampilkan hasil
        System.out.println("\n--- Hasil Operasi ---");
        System.out.println("Penjumlahan : " + hasilTambah);
        System.out.println("Pengurangan : " + hasilKurang);
        System.out.println("Perkalian   : " + hasilKali);
        System.out.println("Pembagian   : " + hasilBagi);

        
    }
}
