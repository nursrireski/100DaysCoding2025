import java.util.Scanner;

public class day79 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ======== FASE REGISTRASI ========
        System.out.println("=== Registrasi Akun ===");

        String username;
        String password;

        while (true) {
            System.out.print("Buat Username: ");
            username = input.nextLine();

            System.out.print("Buat Password: ");
            password = input.nextLine();

            if (username.isEmpty() || password.isEmpty()) {
                System.out.println("Error: Username dan Password tidak boleh kosong!\n");
            } else {
                System.out.println("Registrasi Berhasil!\n");
                break;
            }
        }


        // ======== FASE LOGIN ========
        System.out.println("=== Login Akun ===");

        while (true) {
            System.out.print("Masukkan Username: ");
            String loginUser = input.nextLine();

            System.out.print("Masukkan Password: ");
            String loginPass = input.nextLine();

            if (loginUser.equals(username) && loginPass.equals(password)) {
                System.out.println("Login Berhasil! Pintu Terbuka");
                break;
            } else {
                System.out.println("Gagal: Username atau Password salah! Silakan coba lagi.\n");
            }
        }

      
    }
}
