package latihan.latihan2;

public class RumusFaktorial {
    public int hitungFaktorial(int n){
        int faktorial = 1;
        for(int i = 1 ; i <= n ; i++){
            faktorial *= i;
        }
        return faktorial;
    }
    
}
