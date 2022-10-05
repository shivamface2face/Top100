package ASCII;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int len;
        len=order(n);
        if(armstrong(n,len)){
            System.out.println("is an armstrong");
        }else{
            System.out.println("is not an armstrong");
        }
    }
    static int order(int n){
        int len=0;
        while(n>0){
            len++;
            n/=10;
        }
        return len;
    }
    static boolean armstrong(int n,int len){
        int sum=0;
        int temp=n;
        int digit;
//        extract a digit and calculate its power
        while(temp>0){
            digit=temp%10;
            sum+=Math.pow(digit,len);
            temp/=10;
        }
        return n==sum;
    }
}
