package ASCII;
import java.util.*;
public class Pallindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int  rem;
        int res=0;
        int temp=n;
        while(temp>0){
            rem=temp%10;
            res=res*10+rem;
            temp/=10;
        }
        if(res==n){
            System.out.println("given no is an pallindrom");
        }else{
            System.out.println("not an a plallindrom");
        }
    }
}
