
import java.util.Scanner;

public class day31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai tes logika
        System.out.print("Masukkan nilai tes logika Anda: ");
        int nilaiTes = input.nextInt();

        // Meminta pengguna memasukkan pengalaman coding dalam tahun
        System.out.print("Masukkan pengalaman coding Anda (dalam tahun): ");
        int pengalaman = input.nextInt();

        // Mengecek apakah kedua syarat terpenuhi
        boolean diterima = (nilaiTes >= 80) && (pengalaman > 2);

        // Menampilkan hasil akhir
        System.out.println("\n=== HASIL PENDAFTARAN ELITE CODER ===");
        System.out.println("Diterima: " + diterima);
    }
}

