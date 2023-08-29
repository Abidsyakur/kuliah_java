package tugas.tugas3;
import java.util.Scanner;

public class prima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan minimal bil prima : ");
        int mulai = scanner.nextInt();
        System.out.println("masukkan maks bil prima : ");
        int akhir = scanner.nextInt();

        bilprima prima1 = new bilprima();

        scanner.close();
        
        prima1.showPrima(mulai, akhir);
    }


}
