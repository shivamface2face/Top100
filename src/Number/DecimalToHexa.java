package Number;
import java.util.*;
public class DecimalToHexa {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        char arr[]=new char[200];
        int i=0;
        while(n>0){
            int rem=n%16;
            if(rem<10){
                arr[i]=(char)(rem+48);
                i++;
            }else{
                arr[i]=(char)(rem+55);
                i++;
            }
            n=n/16;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(arr[j]);
        }
    }
}
