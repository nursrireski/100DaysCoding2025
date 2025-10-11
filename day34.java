
import java.util.Scanner;

public class day34 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        // Input data dari pengguna
        System.out.print("Masukkan peringkat Anda: ");
        int peringkat = input.nextInt();

        System.out.print("Masukkan jumlah pertandingan yang dimainkan: ");
        int jumlahMain = input.nextInt();

        System.out.print("Masukkan rasio K/D Anda: ");
        double rasioKD = input.nextDouble();

        System.out.print("Apakah Anda pemain baru? (true/false): ");
        boolean isPemainBaru = input.nextBoolean();

        System.out.print("Apakah Anda memiliki Golden Ticket? (true/false): ");
        boolean punyaTiketEmas = input.nextBoolean();

        // ====== LOGIKA ======

        boolean syaratUtama = (peringkat >= 1000) && (jumlahMain % 10 != 0);
        boolean syaratBonus = ((rasioKD > 1.5 && !isPemainBaru) || punyaTiketEmas);
        boolean lolosKualifikasi = syaratUtama && syaratBonus;

        
        
        System.out.println("\nDetail:");
        System.out.println("Syarat utama terpenuhi: " + syaratUtama);
        System.out.println("Syarat bonus terpenuhi: " + syaratBonus);
        System.out.println("Apakah Saya Lolos kualifikasi: " + lolosKualifikasi);
    }
}

    
    

