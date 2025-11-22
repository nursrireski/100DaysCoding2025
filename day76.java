import java.util.Scanner;

public class day76 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan Username: ");
            String username = input.nextLine();

            // Cek perintah berhenti
            if (username.equalsIgnoreCase("EXIT")) {
                System.out.println("Program dihentikan.");
                break;
            }

            System.out.print("Masukkan Komentar: ");
            String komentar = input.nextLine();

            // Validasi input kosong
            if (username.trim().isEmpty() || komentar.trim().isEmpty()) {
                System.out.println("Data tidak boleh kosong!");
                continue;
            }

            // Banned user
            if (username.equalsIgnoreCase("joker")) {
                System.out.println("User ini telah dibanned.");
                continue;
            }

            // Filter kata terlarang 
            boolean terlarang = false;

            if (komentar.toLowerCase().contains("kasar")) {
                terlarang = true;
            } else if (komentar.toLowerCase().contains("bodoh")) {
                terlarang = true;
            } else if (komentar.toLowerCase().contains("promo")) {
                terlarang = true;
            }

            if (terlarang) {
                System.out.println("Komentar mengandung konten terlarang!");
                continue;
            }

            // Jika lolos semua pengecekan
            System.out.println("Komentar berhasil dipublikasikan!");
        }

    
    }
}
