package latihan.latihan4;

public class deret {
    public void showDeretGenap(int min, int maks){
        for ( int i = min ; i <= maks ; i++){
            if(i%2 != 0){
                continue; //bilangan ganjil skip
            }else if(i % 6 == 0){
                continue; //bilangan kelipatan 6 skip
            }
            System.out.println(i);
        }
    }
}
