
import java.util.Scanner;

public class day32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Meminta input status keanggotaan
        System.out.print("Apakah anda anggota premium? (true/false): ");
        boolean anggotaPremium = input.nextBoolean();
        //Memints status undangan
        System.out.print("Apaka anda memiliki undangan khusus? (true/false): ");
        boolean undanganKhusus = input.nextBoolean();
        
        //Meliat apakah salah satu syarat terpenuhi
        boolean dapatAksesVip = anggotaPremium || undanganKhusus ;
        //Menampilkan hasil
        System.out.println("Apaka saya mendapatkan akses VIP? : "+dapatAksesVip);
    }
    
}
