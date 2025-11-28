import java.util.Scanner;

public class day82 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Tanya jumlah tamu
        System.out.print("Berapa tamu yang ingin dicatat? ");
        int jumlah = input.nextInt();
        input.nextLine(); // membersihkan buffer

        // Membuat array sesuai jumlah tamu
        String[] tamu = new String[jumlah];

        // Input nama tamu
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nama tamu ke-" + (i+1) + ": ");
            tamu[i] = input.nextLine();
        }

        // Output daftar tamu
        System.out.println("\n--- Daftar Tamu Hadir ---");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i+1) + ". " + tamu[i]);
        }

        
    }
}
