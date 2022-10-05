package Number;
import java.util.*;
public class Permutation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int r=in.nextInt();
        int ans=fact1(n);
        int ans2=fact2(n-r);
        int finall=ans/ans2;
        System.out.println(finall);
    }
    static int fact1(int n){
        if(n<1){
            return 1;
        }
        return n*fact1(n-1);
    }
    static int fact2(int r){
        if(r<1){
            return 1;
        }
        return r*fact1(r-1);
    }
}
