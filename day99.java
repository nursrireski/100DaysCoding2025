import java.util.Scanner;

public class day99 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas atas angka: ");
        int n = input.nextInt();

        System.out.println("Deretan Bilangan Prima 1 - " + n + ":");

        // Loop luar untuk mengecek setiap angka dari 2 sampai n
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            // Loop dalam untuk mengecek apakah i memiliki pembagi
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; // hentikan pengecekan
                }
            }

            // Jika masih prima, cetak angkanya
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
