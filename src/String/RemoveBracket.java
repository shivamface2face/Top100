package String;
import java.util.*;
public class RemoveBracket {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        String ans=str.replaceAll("[{}()]","");
        System.out.println(ans);
    }
}
