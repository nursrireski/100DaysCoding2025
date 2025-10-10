import java.util.Scanner;

public class CekAksesBioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di Bioskop Digital");
        System.out.print("Apakah usia Anda 17 tahun ke atas? (true/false): ");
        boolean cukupUmur = input.nextBoolean();

        System.out.print("Apakah Anda memiliki izin orang tua? (true/false): ");
        boolean izinOrtu = input.nextBoolean();

        // Kombinasi operator NOT (!) dan OR (||)
        boolean bolehMasuk = cukupUmur || (!cukupUmur && izinOrtu);

        System.out.println("\n==============================");
        System.out.println("Status kelayakan menonton film:");
        System.out.println("Cukup umur      : " + cukupUmur);
        System.out.println("Izin orang tua  : " + izinOrtu);
        System.out.println("------------------------------");
        System.out.println("Boleh menonton? : " + bolehMasuk);
        System.out.println("==============================");

    }
          }
