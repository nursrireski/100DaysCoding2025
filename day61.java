import java.util.Scanner;

public class day61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input batas angka
        System.out.print("Masukkan batas angka (N): ");
        int N = input.nextInt();

        // Meminta input angka kelipatan
        System.out.print("Masukkan angka kelipatan (M): ");
        int M = input.nextInt();

        System.out.println("\nKelipatan " + M + " antara 1 dan " + N + ":");

        // Perulangan dari 1 sampai N
        for (int i = 1; i <= N; i++) {
            // Mengecek apakah i adalah kelipatan M
            if (i % M == 0) {
                System.out.print(i + " ");
            }
        }

        
    }
}
