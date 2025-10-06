
import java.util.Scanner;

public class day29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan tinggi badan anda: ");
        float tinggi = sc.nextFloat();
        System.out.print("Masukkan berat badan anda: ");
        float berat = sc .nextFloat();
        System.out.println("\n=== DATA PENGUNJUNG ===");
        System.out.println("Tinggi Badan: "+tinggi+" cm");
        System.out.println("Berat Badan : "+berat+" kg");
        System.out.println();
        
        boolean tinggiOk = tinggi > 150;
        boolean beratOk = berat < 80;
        boolean masuk = tinggiOk != beratOk;
        System.out.println("Apakah tinggi badan sesuai dengan aturan?: "+tinggiOk);
        System.out.println("Apakah bearat badan sesuai dengan aturan?: "+beratOk);
        System.out.println("Apakah saya dapat masuk wahana: "+ masuk);
        
      
    }
    
}
