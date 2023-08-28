package percobaan.percobaan2;

public class SwitchName {
    public static void main(String[] args) {
        char firstInitial = 'a';
        System.out.println("masukkan huruf awal nama anda : ");
        try {
            firstInitial = (char)System.in.read();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error : " + e.toString());
        }

        switch (firstInitial) {
                case 'a':
                 System.out.println("nama anda pasti asep");
                case 'b':
                System.out.println("nama anda pasti brodin!");
                case 'c': 
                System.out.println("nama anda pasti cecep!");
                default:
                System.out.println("nama anda tidak terkenal");
        }   
    }
}
