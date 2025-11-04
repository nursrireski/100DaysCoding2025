
import java.util.Scanner;

public class day58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan N: ");
        int n = sc.nextInt();
        for (int i = 1; i < n ; i++) {
            for (int l = i; i > 0; i--) {
            System.out.println(i);
            
            }  
        }
    }
    
}
