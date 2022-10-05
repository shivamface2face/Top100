package ASCII;
import java.util.*;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int res=0;
        while(n>0){
            int temp=n%10;
            res=res+temp;
            n/=10;
        }
        System.out.println(res);
    }
}
