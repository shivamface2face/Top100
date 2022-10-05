package Number;
import java.util.*;
public class OcatalToDeci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        double ans=0;
        int rem=0;
        int p=0;
        while(n>0){
            rem=n%10;
            ans=ans+rem*Math.pow(8,p);
            n/=10;
            p++;
        }

        System.out.println(ans);
    }
}
