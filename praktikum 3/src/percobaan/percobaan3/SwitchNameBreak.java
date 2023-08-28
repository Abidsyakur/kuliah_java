package percobaan.percobaan3;

public class SwitchNameBreak {
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
                break;
                case 'b':
                System.out.println("nama anda pasti brodin!");
                break;
                case 'c': 
                System.out.println("nama anda pasti cecep!");
                break;
                default:
                System.out.println("nama anda tidak terkenal");
        }   
    }
}
