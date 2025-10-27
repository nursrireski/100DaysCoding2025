import java.util.Scanner;

public class day50 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        String hasil = (angka % 2 == 0)? "genap":"ganjil";
        System.out.println("Angka "+angka+" adalah bilangan "+ hasil);
    }
    
}
