
import java.util.Scanner;

public class day17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Contoh 1:");
        System.out.println("input:");
        int permen = sc.nextInt();
        int murid = sc.nextInt();
        
        int permenSetiapMurid = permen / murid;
        int sisaPermen = permen % murid;
        
        System.out.println("Output:");
        System.out.println(permenSetiapMurid);
        System.out.println(sisaPermen);
        
        System.out.println();
        System.out.println("Contoh 2:");
        System.out.println("input:");
        permen = sc.nextInt();
        murid = sc.nextInt();
        
        permenSetiapMurid = permen / murid;
        sisaPermen = permen % murid;
        
        System.out.println("Output:");
        System.out.println(permenSetiapMurid);
        System.out.println(sisaPermen);
    }
    
}
