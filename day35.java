import java.util.Scanner;

public class day35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input posisi awal
        System.out.print("Masukkan posisi awal x: ");
        int x = input.nextInt();

        System.out.print("Masukkan posisi awal y: ");
        int y = input.nextInt();

        System.out.print("Masukkan arah (U/S/T/B): ");
        String arah = input.next();  // input bertipe String

        // Ambil huruf pertama dari input arah
        char arahHuruf = arah.charAt(0);

        // Percabangan arah pergerakan
        if (arahHuruf == 'U' || arahHuruf == 'u') {
            y = y + 1; // naik satu langkah ke utara
        } else if (arahHuruf == 'S' || arahHuruf == 's') {
            y = y - 1; // turun satu langkah ke selatan
        } else if (arahHuruf == 'T' || arahHuruf == 't') {
            x = x + 1; // ke kanan satu langkah ke timur
        } else if (arahHuruf == 'B' || arahHuruf == 'b') {
            x = x - 1; // ke kiri satu langkah ke barat
        } else {
            System.out.println("Arah tidak dikenali!");
            return;
        }

        // Output posisi akhir Adam
        System.out.println("Posisi akhir Adam: (" + x + ", " + y + ")");
    }
}