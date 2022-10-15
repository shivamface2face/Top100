package String;
import java.util.*;
public class CheckAlphabet {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char c=in.next().charAt(0);
        if((c>=65 && c<=90)||(c>=97 && c<=122)){
            System.out.println("it is alphabet");
        }else{
            System.out.println("not a alphabet");
        }
    }
}
