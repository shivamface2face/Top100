package ASCII;
import java.util.*;
public class FiboPrint {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=0,b=1;
        System.out.print(a+" "+b);
        int nextOne;
        for(int i=2;i<=n;i++){
            nextOne=a+b;
            a=b;
            b=nextOne;
            System.out.print(nextOne+" ");
        }
    }
}
