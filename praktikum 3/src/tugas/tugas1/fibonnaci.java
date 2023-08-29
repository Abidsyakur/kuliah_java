package tugas.tugas1;

public class fibonnaci {
    public int RumusFibonacci(int n){
        if ( n <= 1){
            return n ;
        }

         int bilanganbefore = 0;
         int bilangansekarang = 1;
         for ( int i = 2 ; i <= n ; i++){
            int simpan = bilangansekarang;
            bilangansekarang = bilanganbefore + bilangansekarang;
            bilanganbefore = simpan;
         }
         return bilangansekarang;
    }
}
