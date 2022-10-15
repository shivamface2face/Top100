package String;
import java.util.*;
public class FirstRepeatingChar {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    System.out.println(str.charAt(i));
                    break;
                }
            }
        }
    }
}
