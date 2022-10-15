package String;
import java.util.*;
public class RemoveExceptVowel {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        str=str.replaceAll("[^a-zA-Z]","");
        System.out.println(str);
    }
}
