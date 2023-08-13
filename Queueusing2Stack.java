import java.net.http.HttpResponse.PushPromiseHandler;

import java.util.*;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;
public class Queueusing2Stack {
    public static class Queue{
        static Stack<Integer> s1 = new Stack<>(); 
        static Stack<Integer> s2= new Stack<>(); 
        
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void Enqueue(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int Dequeue(){
            if(isEmpty()){
                System.out.println("Queue is Underflow");
            }
            return s1.pop();
        }
          public static int Peek(){
            if(isEmpty()){
                System.out.println("Queue is Underflow");
            }

            return s1.peek();
          }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(5);
        while(!q.isEmpty()){
           System.out.println(q.Peek());
           q.Dequeue();
        }
    }
}
