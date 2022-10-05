package ASCII;
import java.util.*;
public class PowerOfNo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double n=in.nextInt();
        double p=in.nextInt();
        double ans=Math.pow(n,p);
        System.out.println(ans);
        double res=1;
        while(p>0){
            res=res*n;
            p--;
        }
        System.out.println(res);
    }
}
