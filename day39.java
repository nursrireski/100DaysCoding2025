import java.util.Scanner;

public class day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Cetakan 1
        System.out.println(" WARUNG MINUM SEGAR \n1. Es Teh (Rp 5.000)\n2. Es Jeruk (Rp 7.000)\n3. Kopi Susu (Rp 8.000)\n");

        System.out.print("Masukkan nomor pilihan (1-3): ");
        int pilihan = input.nextInt();

        String pesan;

        if (pilihan == 1)
            pesan = "Anda memilih  Es Teh - Rp 5.000.\nSegarnya bikin adem!";
        else if (pilihan == 2)
            pesan = "Anda memilih  Es Jeruk - Rp 7.000.\nRasanya manis dan segar!";
        else if (pilihan == 3)
            pesan = "Anda memilih  Kopi Susu - Rp 8.000.\nNikmatnya bikin semangat!";
        else
            pesan = "Pilihan tidak valid. Silakan jalankan ulang.";

        // Cetakan 2
        System.out.println("\n" + pesan + "\nTerima kasih telah memesan di Warung Minum Segar!");

        
    }
}
