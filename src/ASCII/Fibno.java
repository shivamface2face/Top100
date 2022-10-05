package ASCII;
import java.util.*;
public class Fibno {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int ans=fibo(n);
        System.out.print(ans);
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }

        return fibo(n-1)+fibo(n-2);

    }
}
