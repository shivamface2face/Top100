package ASCII;
import java.util.*;
public class OddEvn {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n%2==0){
            System.out.println("evn");
        }else{
            System.out.println("odd");
        }
    }

}
