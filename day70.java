import java.util.Scanner;

public class day70 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Panjang (P): ");
        int P = input.nextInt();

        System.out.print("Masukkan Lebar (L): ");
        int L = input.nextInt();

        // Loop luar mengontrol baris (P)
        for (int i = 1; i <= P; i++) {
            // Loop dalam mengontrol kolom (L)
            for (int j = 1; j <= L; j++) {
                System.out.print("*");
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
    }
}
