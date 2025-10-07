
import java.util.Scanner;

public class day30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Umur: ");
        byte umur = sc.nextByte();
        System.out.println("=== SYARAT KATEGORY BALITA ===");
        boolean minimal = umur >= 1;
        boolean maksimal = umur <= 5;
        boolean syarat =!( minimal ^ maksimal);
        System.out.println("Apakah syarat minimalnya terpenuhi:  "+minimal);
        System.out.println("Apakah syarat maksimalnya terpenuhi:  "+maksimal);
        System.out.println("Apakah dia termasuk kategori balita?:  "+syarat);
        
        
    }
    
}
