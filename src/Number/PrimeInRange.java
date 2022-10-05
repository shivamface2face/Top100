package Number;
import java.util.*;
public class PrimeInRange {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        for(int i=1;i<=100;i++){
            if(CheckPrime(i)){
                System.out.println(i+" ");
            }
        }
    }
    static boolean CheckPrime(int n){
        if(n<2){
            return false;
        }else{
            for(int i=2;i<Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
