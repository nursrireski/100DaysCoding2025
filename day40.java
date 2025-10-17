import java.util.Scanner;

public class day40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        double hasil = 0;
        boolean valid = true; 

        
        boolean inputDesimal = (angka1 % 1 != 0) || (angka2 % 1 != 0);

        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == '/') {
            if (angka2 == 0) {
                System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                valid = false;
            } else {
                hasil = angka1 / angka2;
            }
        } else {
            System.out.println("Operator tidak dikenali. Gunakan +, -, *, atau /.");
            valid = false; 
        }

        
        if (valid) {
            if (inputDesimal) {
                System.out.println("Hasil: " + hasil); 
            } else {
                if (hasil % 1 == 0) {
                    System.out.println("Hasil: " + (int) hasil); 
                } else {
                    System.out.println("Hasil: " + hasil); 
                }
            }
        }
    }
}
