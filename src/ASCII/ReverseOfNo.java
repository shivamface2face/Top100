package ASCII;
import java.util.*;
public class ReverseOfNo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int  rem;
        int res=0;
        while(n>0){
            rem=n%10;
            res=res*10+rem;
            n/=10;
        }
        System.out.println(res);
    }
}

