import java.util.Scanner;

public class day87 {
    public static void main(String[] args) {
        
        // Data buku
        String[] buku = {
            "Harry Potter",
            "Lord of the Rings",
            "Alchemist",
            "Sherlock Holmes",
            "Hobbit"
        };
        
        Scanner input = new Scanner(System.in);

        System.out.println("--- Cari Buku ---");
        System.out.print("Masukkan judul buku: ");
        String cari = input.nextLine();

        // Ubah input jadi case-insensitive
        String cariLower = cari.toLowerCase();

        int index = -1;

        // Cari buku
        for (int i = 0; i < buku.length; i++) {
            if (buku[i].toLowerCase().equals(cariLower)) {
                index = i;
                break;
            }
        }

        // Tampilkan hasil
        if (index != -1) {
            System.out.println("\nHasil: Buku '" + buku[index] + "' ditemukan di indeks ke-" 
                               + index + " (Tumpukan ke-" + (index + 1) + ").");
        } else {
            System.out.println("\nHasil: Maaf, buku tidak ada di tumpukan.");
        }

        
    }
}
