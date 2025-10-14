
import java.util.Scanner;

public class day37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Angka: ");
        int angka = sc.nextInt();
        if(angka %2==0){
            System.out.println(angka+" adalah bilangan genab");
        }else{
            System.out.println(angka+" adalah bilangan ganjil");
        }
    }
    
}
