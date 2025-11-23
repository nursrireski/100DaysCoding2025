import java.util.Scanner;
public class day77 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Hashtag : ");
        String teksAsli = input.nextLine();
        
        String hasil = teksAsli.trim();
        hasil = hasil.replace("i", "e");
        hasil = hasil.substring(2);
        hasil = hasil.toUpperCase();
        
        System.out.println("\n--- Hasil Data Cleaning ---");
        System.out.println("Tag Asli : " + teksAsli);
        System.out.println("Tag Bersih : " + hasil);
    }
        
    }
