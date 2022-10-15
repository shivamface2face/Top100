package String;
import java.util.*;
public class RemoveVowel {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String ans="";
        ans=str.replaceAll("[aeiou]","");
        System.out.println(ans);
    }
}
