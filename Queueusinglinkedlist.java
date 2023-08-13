import java.beans.PersistenceDelegate;

public class Queueusinglinkedlist {
     static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next =null;
        }
    }
    public static class Queue{
               static Node head = null;
               static Node tail = null;
           
            public static boolean isEmpty(){
                return head==null && tail==null;
            }
            public static void Enqueue(int data){
                Node newNode = new Node(data);
                if(isEmpty()){
                    tail = head = newNode;
                    return;
                }else{
                    tail.next = newNode;
                    tail = newNode;
                }

            }
            public static int Dequeue(){
                if(isEmpty()){
                    System.out.println("Queue is Empty");
                }
               int front = head.data;
               if(head==tail){
                tail=null;
               }
               head = head.next;

               return front;
            }
            public static int Peek(){
                if(isEmpty()){
                    System.out.println("Queue is Underflow");
                }
                return head.data;
            }
    }
    public static void main(String[] args) {
        Queue q =new Queue();
        q.Enqueue(1);
        q.Enqueue(3);
        q.Enqueue(4);
        q.Enqueue(5);

        while(!q.isEmpty()){
            System.out.println(q.Peek());
            q.Dequeue();
        }
    }
}
