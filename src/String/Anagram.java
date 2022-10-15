package String;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str1=in.next();
        String str2=in.next();
        System.out.println(isAnagram(str1,str2));
    }
    static boolean isAnagram(String ans1, String ans2) {
            boolean status=true;
            String s1 = ans1.replaceAll("[\\s]", "");
            String s2 = ans2.replaceAll("[\\s]", "");
            if(ans1.length()!=ans2.length()){
                return status=false;
            }else{
                char[] a1=s1.toLowerCase().toCharArray();
                char[] a2=s2.toLowerCase().toCharArray();
                Arrays.sort(a1);
                Arrays.sort(a2);
                status=Arrays.equals(a1,a2);
            }

            return status;
    }
}
