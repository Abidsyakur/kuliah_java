package percobaan.percobaan6;

public class BreakLoop {
    public static void main(String[] args) {
        int i = 0;
        do{
            System.out.println("iterasi ke " + i);
            i++;
            if (i > 10) break;
        }   
        while(true);
    }
}
