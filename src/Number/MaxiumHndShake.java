package Number;
import java.util.*;
public class MaxiumHndShake {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int ans=(n*(n-1))/2;
        System.out.println(ans);
    }
}
