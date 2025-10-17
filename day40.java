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
        

        if (operator == '+') {
            hasil = angka1 + angka2;
             if (hasil % 1 == 0) {
            System.out.println("Hasil: " + (int) hasil);  
        } else {
            System.out.println("Hasil: " + hasil);        
        }
        } 
        else if (operator == '-') {
            hasil = angka1 - angka2;
             if (hasil % 1 == 0) {
            System.out.println("Hasil: " + (int) hasil);  
        } else {
            System.out.println("Hasil: " + hasil);        
        }
        } 
        else if (operator == '*') {
            hasil = angka1 * angka2;
             if (hasil % 1 == 0) {
            System.out.println("Hasil: " + (int) hasil);  
        } else {
            System.out.println("Hasil: " + hasil);        
        }
        } 
        else if (operator == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
                } else {
                System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
            }
            if(angka1 % 1 == 0){
                hasil = angka1 / angka2;
            System.out.println("Hasil: " + (int) hasil);  
            } else {
            System.out.println("Hasil: " + hasil);        
    
            }
        } 
        else {
            System.out.println("Operator tidak dikenali. Gunakan +, -, *, atau /.");
          
        }

       
    }
}
