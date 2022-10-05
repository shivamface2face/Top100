package ASCII;
import java.util.*;
public class GraterOfTree {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        if(a>b && a>c){
            System.out.println("a is grater");
        }else if(b>a && b>c){
            System.out.println("b is grater");
        }else{
            System.out.println("c is grater");
        }
    }
}
