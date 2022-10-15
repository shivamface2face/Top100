package String;
import java.util.*;
public class ToggelCharcter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String ans="";
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                ans=ans+Character.toLowerCase(str.charAt(i));
            }else{
                ans+= Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(ans);
    }
}
