package String;
import java.util.*;
public class SumOfNoInString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        int res=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                res+=(str.charAt(i)-'0');
            }
        }
        System.out.println(res);
    }
}

