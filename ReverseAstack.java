import java.util.*;
public class ReverseAstack {
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
    public static void Reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        Reverse(s);
        pushAtBottom(top, s); 
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        Reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
     }
    }

