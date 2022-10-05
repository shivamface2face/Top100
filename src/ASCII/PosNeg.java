package ASCII;
import java.util.*;
public class PosNeg {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n==0){
            System.out.println("nor +ve nor a -ve");
        }
        else if(n>0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }
    }
}
