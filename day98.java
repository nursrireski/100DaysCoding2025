import java.util.Scanner;

public class day98 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Meminta input dari user
        System.out.print("Masukkan jumlah deret: ");
        int n = input.nextInt();

        // Variabel awal (Geser Wadah)
        int masaLalu = 0;
        int masaKini = 1;
        int masaDepan;

        System.out.println("\nDeret Fibonacci:");

        // Loop untuk mencetak deret Fibonacci
        for (int i = 0; i < n; i++) {
            System.out.print(masaLalu + " ");

            // Hitung nilai selanjutnya
            masaDepan = masaLalu + masaKini;

            // Geser posisi wadah
            masaLalu = masaKini;
            masaKini = masaDepan;
        }
    }
}
