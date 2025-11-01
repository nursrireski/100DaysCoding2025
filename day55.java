import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan batas bawah : ");
        int batasBawah = sc.nextInt();
        System.out.print("Masukkan batas atas : ");
        int batasAtas = sc.nextInt();
        System.out.print("Masukkan bilangan bulat : ");
        int bi = sc.nextInt();   
        
        if(bi <= batasAtas && bulat >= batasBawah){
            System.out.println("YAYAYAYA");
        }else{
            System.out.println("NONONONO");
        }
    }
    
}

import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = sc.nextInt();
        
        if(nilai > 70 && nilai <=100){
            System.out.println("Ujian Kroco Ji Pale");
        }else{
            System.out.println("Sa Jappo'ka Aih");
        }
    }
}

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();
        
        if(angka > 0){
            System.out.println("Iyaji");
        }else{
            System.out.println("Tidakji");
        }
    }
}
