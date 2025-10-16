import java.util.Scanner;

public class day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println(" SELAMAT DATANG DI WARUNG MINUM SEGAR ");
        System.out.println("========================================");
        System.out.println("Silakan pilih minuman yang Anda inginkan:");
        System.out.println("----------------------------------------");
        System.out.println("1. Es Teh       - Rp 5.000");
        System.out.println("2. Es Jeruk     - Rp 7.000");
        System.out.println("3. Kopi Susu    - Rp 8.000");
        System.out.println("----------------------------------------");
        System.out.print("Masukkan nomor pilihan Anda (1-3): ");

        int pilihan = input.nextInt();
        System.out.println("----------------------------------------");

        if (pilihan == 1) {
            System.out.println("Anda memesan Es Teh dengan harga Rp 5.000.");
            System.out.println("Segarnya bikin hari makin adem!");
        } else if (pilihan == 2) {
            System.out.println("Anda memesan Es Jeruk dengan harga Rp 7.000.");
            System.out.println("Rasanya manis dan menyegarkan!");
        } else if (pilihan == 3) {
            System.out.println("Anda memesan Kopi Susu dengan harga Rp 8.000.");
            System.out.println("Nikmatnya bikin semangat kembali! ");
        } else {
            System.out.println("⚠ Pilihan tidak valid. Silakan jalankan ulang program dan pilih 1–3.");
        }

        System.out.println("----------------------------------------");
        System.out.println("Terima kasih telah memesan di Warung Minum Segar!");
        System.out.println("========================================");
    }
}