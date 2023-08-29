package tugas.tugas1;

import java.util.Scanner;

public class deretFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan berapa deret Fibonacci? ");
        int bilangan = scanner.nextInt();

        System.out.print(bilangan + " deret fibonacci = "); // Menggunakan print bukan println
        fibonnaci fibo = new fibonnaci();
        for (int i = 0; i < bilangan; i++) {
            System.out.print(fibo.RumusFibonacci(i) + " "); // Menambahkan spasi di sini
        }
        System.out.println(); // Baris baru setelah deret selesai
        scanner.close();
    }
}
