package Number;
import java.util.*;
public class QuarEqun {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        double a=in.nextInt();
        double b=in.nextInt();
        double c=in.nextInt();
        double p=b*b-4*a*c;
        double d=Math.sqrt(p);
        if(d>0){
            double x1=(-b+d)/(2*a);
            double x2=(-b-d)/(2*a);
            System.out.println(x1+" "+x2);
        }else if(d==0){
            double x3=(-b)/(2*a);
            System.out.println(x3);

        }
    }
}
