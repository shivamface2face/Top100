package Number;
import java.util.*;
public class CountDigit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        while(n>0){
            int rem=n%10;
            count++;
            n/=10;
        }
    }
}
