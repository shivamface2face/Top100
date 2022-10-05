package Number;
import java.util.*;
public class Lcm {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int x=Math.max(a,b);
        int y=a*b;
        int ans=x;
        for(int i=x;i<=y;i++){
            if(i%a==0 && i%b==0){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}
