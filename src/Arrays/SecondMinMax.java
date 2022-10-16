package Arrays;
import java.util.*;
public class SecondMinMax {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for (int i = 0; i <n ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int secMin=Integer.MAX_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]!=min && arr[i]<secMin){
                secMin=arr[i];
            }
        }
        for (int i = 0; i <n ; i++) {
            if(arr[i]!=max && arr[i]>secMax){
                secMax=arr[i];
            }
        }
        System.out.println(secMax);
        System.out.println(secMin);
    }
}
