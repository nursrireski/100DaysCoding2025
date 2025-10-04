
import java.util.Scanner;

public class day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Panjang Rumah: ");
        int P = sc.nextInt();
        System.out.print("Masukkan Lebar Rumah: ");
        int L = sc.nextInt();
        int sisiLantai = 2*2;
        
        int jumlah = (P*L)/sisiLantai;
        System.out.println("Jadi jumlah lantai yang di butuhkan tukang tersebut adalah: "+jumlah);
    }
    
}
