package ASCII;
import java.util.*;
public class PrimeInRange {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int start=in.nextInt();
        int end=in.nextInt();
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int n){
        int count=0;
        if(n<2){
            return false;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

