import java.util.*;
public class Leetcode1 {
    public static String IntegerToroman(int n){
    String roman[] ={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    int number[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    StringBuffer integerToroman = new StringBuffer();
    for(int i=0;i<number.length;i++){
        while(n >= number[i]){
           n = n - number[i];
           integerToroman.append(roman[i]);
        }
    }

    return integerToroman.toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       System.out.println(IntegerToroman(n));
    }
}
