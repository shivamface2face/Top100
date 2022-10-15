package String;
import java.util.*;
public class VowelOrConsonent {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char c=in.next().charAt(0);
        if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            System.out.println("vowel");
        }else{
            System.out.println("not a vowel");
        }
    }
}
