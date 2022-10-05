package Number;
import java.util.*;
public class Replace0by1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String str=Integer.toString(n);
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                ans=ans+'1';
            }else{
                ans+= str.charAt(i);
            }
        }
        System.out.println(ans);
        in.close();
    }
}
