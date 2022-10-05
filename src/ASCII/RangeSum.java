package ASCII;
import java.util.*;
public class RangeSum {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int l=in.nextInt();
        int h=in.nextInt();
        int sum=0;
        for(int i=l;i<=h;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
