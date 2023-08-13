import java.nio.channels.ScatteringByteChannel;
import java.util.*;
public class weekchallage6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int min=0;
        for(int i=0;i<n ;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
             min = i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }
        }
        int sum = 0;
        for(int i=0;i<n;i++){
           if(a[i]!=a[min]){
            sum = sum + a[i];
           }
        }
        System.out.println(sum);
    }
}
