import java.util.*;

public class day100 {

    static int[] arrayBaru;

    static void retas(int[] arr) {
        int n = arr.length;
        arrayBaru = new int[n];

        for (int i = 0; i < n; i++) {
            arrayBaru[i] = -1;
        }

        for (int x : arr) {
            int a = x % n;

            while (arrayBaru[a] != -1) {
                a = (a + 1) % n;
            }

            arrayBaru[a] = x;
        }
    }

    static String susunKode(int n) {
        int panjang = n * (n + 1); // contoh: 5 × 6 = 30
        String hasil = "";

        int i = 0;
        while (hasil.length() < panjang) {
            hasil += arrayBaru[i % n];
            i++;
        }

        return hasil;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        retas(ar);
        System.out.println(susunKode(n));
    }
}