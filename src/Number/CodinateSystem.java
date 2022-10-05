package Number;
import java.util.*;
public class CodinateSystem {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        if(x> 0&& y>0){
            System.out.println("cordinate lie in a 1st quardent");
        }else if(x>0 && y<0){
            System.out.println("cordinate lie in a 4th quardent");
        }else if(x<0 && y>0){
            System.out.println("cordinate lie in a 2nd quardent");
        }else if(x<0 && y<0){
            System.out.println("cordinate lie in a 3rd quardent");
        }else if(x!=0 && y==0){
            System.out.println("cordinate lie in a x axis");
        }else if(x==0 && y!=0){
            System.out.println("cordinate lie in a y axis");
        }else{
            System.out.println("cordinate lie in a orgin");
        }

    }
}
