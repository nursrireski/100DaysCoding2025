import java.util.Scanner;

public class day75 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input dari user
        System.out.print("Masukkan teks: ");
        String teks = input.nextLine();

        // Menggunakan method-method String
        int panjang = teks.length();
        String hurufBesar = teks.toUpperCase();
        String hurufKecil = teks.toLowerCase();

        // Output
        System.out.println("\n=== HASIL MANIPULASI STRING ===");
        System.out.println("Teks Asli: " + teks);
        System.out.println("Panjang karakter: " + panjang);
        System.out.println("Huruf Besar: " + hurufBesar);
        System.out.println("Huruf Kecil: " + hurufKecil);
        System.out.println("Cek Teks Asli Lagi: " + teks); // String tetap immutable

        input.close();
    }
}
