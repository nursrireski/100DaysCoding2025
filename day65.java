import java.util.Scanner;

public class day65{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int N = input.nextInt();

        int hasil = 1;
        for (int i = N; i >= 1; i--) {
            hasil *= i;
            System.out.print(i);
            if (i > 1){
            System.out.print(" x ");
        }
        }
        System.out.println(" = " + hasil);
    }
}
