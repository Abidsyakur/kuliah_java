package tugas.tugas1;

public class Main {
    public static void main(String[] args) {
        int[][] arrayOfInts = {
            { 32, 87, 3, 589},
            {12, 1076, 2000, 8},
            {622, 127, 77, 955}
        };
        
        CariArray cariArray1 = new CariArray(arrayOfInts);
        cariArray1.cari(12);
    }
}
