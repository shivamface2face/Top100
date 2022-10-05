package Number;
import java.util.*;
public class HexiToDeci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        int n=in.nextInt();
        String str=in.nextLine();
        System.out.println(Hexa(str));
    }
    static int Hexa(String str){
        String digits = "0123456789ABCDEF";
        str=str.toUpperCase();
        int val=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            int d=digits.indexOf(c);
            val=16*val+d;
        }
        return val;
    }
}
