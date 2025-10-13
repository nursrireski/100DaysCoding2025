import java.util.Scanner;

public class day36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data dari pengguna
        System.out.print("Apakah Anda memiliki kartu akses? (true/false): ");
        boolean kartuAkses = input.nextBoolean();

        System.out.print("Apakah Anda sedang dalam jadwal piket? (true/false): ");
        boolean jadwalPiket = input.nextBoolean();

        System.out.print("Masukkan kode PIN: ");
        int pin = input.nextInt();

        // Proses pengecekan berlapis (nested if)
        if (kartuAkses) {
            System.out.println("Kartu akses valid. Lanjut ke pintu ruang IT...");

            if (jadwalPiket) {
                System.out.println("Anda terdaftar dalam jadwal piket hari ini. Lanjut ke pintu ruang server...");

                if (pin == 1234) {
                    System.out.println("Akses diterima! Selamat datang di ruang server utama.");
                } else {
                    System.out.println("Kode PIN salah! Akses ditolak di pintu ruang server.");
                }

            } else {
                System.out.println("Anda tidak terdaftar dalam jadwal piket hari ini. Akses ditolak di pintu ruang IT.");
            }

        } else {
            System.out.println("Kartu akses tidak valid! Akses ditolak di pintu gerbang utama.");
        }
    }
}