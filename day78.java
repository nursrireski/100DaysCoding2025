import java.util.Scanner;

public class day78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== DAFTAR AKUN BARU ===");
        System.out.print("Masukkan Username: ");
        String username = sc.nextLine();
        username = username.trim();

        if (username.isEmpty()) {
            System.out.println("EROR: Username tidak boleh kosong!");
            return;
        }

        if (username.length() > 8) {
            System.out.println("EROR: Username terlalu panjang Maksimal 8!");
            return;
        }

        System.out.print("Masukkan Password: ");
        String password = sc.nextLine();

        if (password.length() < 4) {
            System.out.println("EROR: Password minimal 8 karakter!");
            return;
        }

        if (password.toLowerCase().contains("admin")) {
            System.out.println("ERROR: Password tidak boleh mengandung kata 'admin'!");
            return;
        }

        if (!Character.isUpperCase(password.charAt(0))) {
            System.out.println("EROR: Password harus dimulai dengan huruf kapital!");
            return;
        }

        System.out.print("Ulangi Password: ");
        String ulangPass = sc.nextLine();

        if (!password.equals(ulangPass)) {
            System.out.println("EROR: Password tidak cocok!");
            return;
        }

        System.out.println("\nSUKSES: Pendaftaran Berhasil!");
        System.out.println("Username '" + username.toLowerCase() + "' telah aktif.");
    }
}
