public class Circularqueue {
    public static class Queue{
        static int arr[];
        static int size;
        static int rear,front ;
        Queue(int size){
              this.size = size;
              arr = new int[size];
              rear = -1;
              front = -1;
        }
        public static boolean isEmpty(){
            return front==-1 && rear==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        public static void Enqueue(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            // for 1st element
            if(front==-1){
                front=0;
            }
            rear = (rear+1)%size;
            arr[rear]=data;
        }
        public static int Dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int remv = arr[front];
           // if 1 element is there
           if(front==rear){
                 front=rear =-1;
           }else{
            front = (front+1)%size;
           }
           
            return remv;
        }
        public static int Peek(){
            if(isEmpty()){
                System.out.println("Queue is in underflow");
                return -1 ;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(4);
        q.Enqueue(3);
        while(!q.isEmpty()){
            System.out.println(q.Peek());
            q.Dequeue();
        }
    }
    
}
