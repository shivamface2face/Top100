package String;
import java.util.*;
public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        for(char c:str.toCharArray()){
            if(str.indexOf(c)==str.lastIndexOf(c)){
                System.out.println(c);
                break;
            }
        }
    }
}
