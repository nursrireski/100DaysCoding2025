import java.util.Scanner;
public class day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Program Input Biodata ---");

        System.out.print("Masukkan Nama Lengkap Anda: \n> ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM Anda: \n> ");
        String nim = input.nextLine();

        System.out.print("Masukkan Umur Anda: \n> ");
        int umur = input.nextInt();
        input.nextLine(); 

        System.out.print("Masukkan Kelas (A/B/C): \n> ");
        String kelas = input.nextLine();

        System.out.print("Masukkan IPK Anda: \n> ");
        double ipk = input.nextDouble();

        System.out.println("\n=============================");
        System.out.println("       BIODATA MAHASISWA     ");
        System.out.println("=============================");
        System.out.println("Nama   : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Umur   : " + umur + " tahun");
        System.out.println("Kelas  : " + kelas);
        System.out.println("IPK    : " + ipk);
    }
}