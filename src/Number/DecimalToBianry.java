package Number;
import java.util.*;
public class DecimalToBianry {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[20];
        int i=0;
        while(n>0){
            int rem=n%2;
            arr[i++]=rem;
            n=n/2;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(arr[j]);
        }
    }
}
