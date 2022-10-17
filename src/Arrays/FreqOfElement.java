package Arrays;
import java.util.*;
public class FreqOfElement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        countFreq(arr,n);
    }
    static void countFreq(int arr[],int n) {
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && arr[i] == arr[i + 1]) {
                i++;
                count++;
            }
            System.out.println(arr[i] + ": " + count);
        }
    }
}
