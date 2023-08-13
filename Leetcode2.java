import java.util.*;
// Roman to number
public class Leetcode2 {
    public static int RomanToString(String s){
        Map <Character,Integer> m = new HashMap<Character,Integer>();
        m.put('M', 1000);
        m.put('D', 500);
        m.put('C', 100);
        m.put('L', 50);
        m.put('X', 10);
        m.put('V', 5);
        m.put('I', 1);
        s = s.replace("XL","XXXX");
        s = s.replace("CM","DCCCC");
        s = s.replace("CD","CCCC");
        s = s.replace("XC","LXXXX");
        s = s.replace("IX","VIIII");
        s = s.replace("IV","IIII");
        int total = 0;
        for(int i=0;i<s.length();i++){
            total = total + m.get(s.charAt(i));
        }  
        
        return total;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(RomanToString(s));
    }
}
