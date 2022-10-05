package Number;
import java.util.*;
public class BinaryToDeci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        double ans=0;
        int rem=0;
        int p=0;
        while(n>0){
            rem=n%10;
            ans=ans+rem*Math.pow(2,p);
            n/=10;
            p++;
        }

        System.out.println(ans);
        in.close();
    }
}
