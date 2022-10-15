package Number;
import java.util.*;
public class NoOfDayInMonth {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int month=in.nextInt();
        int yr=in.nextInt();
        if((month==2) && ((yr%400==0)||((yr%4==0) && (yr%100!=0)))){
            System.out.println("there is 29 day in a month");
        }else if(month==2){
            System.out.println("there is 28 day in a month");
        }else if(month==1|| month==3 ||month==5 || month==7 || month ==8 || month==10|| month==12){
            System.out.println("there is 31 day in a month");
        }else{
            System.out.println("there is 30 day in a month");
        }
    }
}
