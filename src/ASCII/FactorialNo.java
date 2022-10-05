package ASCII;
import java.util.*;
public class FactorialNo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int ans=fact(n);
        System.out.println(ans);
    }
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}
