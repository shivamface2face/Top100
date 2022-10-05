package ASCII;
import java.util.*;
public class SumOfNat {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
        int res=0;
        res=(n*(n+1))/2;
        System.out.println(res);
    }
}
