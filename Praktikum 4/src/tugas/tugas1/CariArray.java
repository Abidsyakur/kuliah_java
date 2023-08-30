package tugas.tugas1;

public class CariArray {
    public int[][] arrayOfInts;

    public CariArray(int[][] array){
        arrayOfInts = array;
    }

    public void cari(int target){
        boolean found = false;
        int baris = 0;
        int kolom = 0;

        for(int i = 0 ; i < arrayOfInts.length ; i++){
            for(int j = 0 ; j < arrayOfInts[i].length ; j++){
                if(arrayOfInts[i][j] == target){
                    found = true;
                    baris = i;
                    kolom = j;
                    break;
                }
            }
            if(found){
                break;
            }
        }
        
        if(found){
            System.out.println("Found " + target + " at " + baris + "," + kolom);
        }else{
            System.out.println("array tidak ditemukan");
        }
    }
}
