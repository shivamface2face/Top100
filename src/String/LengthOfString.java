package String;
import java.util.*;
public class LengthOfString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        int ans=0;
        for(char c: str.toCharArray()){
            ans++;
        }
        System.out.println(ans);
    }
}
