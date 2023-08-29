package tugas.tugas3;

public class bilprima {
    public boolean cekprima(int bil){
        if(bil <= 1){
            return false;
        }

        for (int i = 2 ; i <= bil/2 ; i++){
            if(bil % i == 0){
                return false;
            }
        }
        return true;
    }

    public void showPrima(int min, int maks){
        System.out.println("bilangan prima dari " + min + " hingga " + maks + " : ");

        for(int i = min ; i <= maks ; i++){
            if(cekprima(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

}
