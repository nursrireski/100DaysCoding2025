
import java.util.Scanner;

public class day23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan panjang: ");
        int panjang = sc.nextInt();
        System.out.print("masukkan lebar: ");
        int lebar = sc.nextInt();
        
      int luas = panjang * lebar;
        System.out.println("Luas persegi Panjang adalah: "+ luas );
        
    }
}
