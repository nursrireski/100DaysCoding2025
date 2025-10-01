
import java.util.*;

public class day24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double phi = 3.14;
        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = sc.nextDouble();
        double luas = phi*(r*r);
        System.out.println("Jadi luas Lingkaran dengan jari-jari "+r+" adalah "+luas);
        
    }
    
}
