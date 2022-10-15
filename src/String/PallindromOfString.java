package String;
import java.util.*;
public class PallindromOfString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String ans="";
        for(int i=str.length()-1;i>=0;i--){
            ans+=str.charAt(i);
        }
        if(ans.equals(str)){
            System.out.println("yes it is");
        }else {
            System.out.println("not");
        }

    }
}
