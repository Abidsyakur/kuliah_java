package latihan.latihan2;
import java.util.Scanner;

public class faktorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan bilangan : ");
        int bilangan = scanner.nextInt();

        RumusFaktorial input = new RumusFaktorial();
        int result = input.hitungFaktorial(bilangan);

        System.out.println("Faktorial dari " + bilangan + " adalah " + result);
    }
    
}
