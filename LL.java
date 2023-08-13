public class LL {
    Node head;
    private int size;
    LL(){
      this.size=0;
    }
    class Node{
      String data;
      Node next;
       Node(String data){
        this.data = data;
        this.next = null;
        size++;
      }
    }
    // add first,last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head ==null){
          head = newNode;
       return ;
        }
        newNode.next=head;
        head = newNode;

    }
    public void addLast(String data){
      Node newNode = new Node(data);
       if(head==null){
        head = newNode;
        return;
       }
       Node tempNode = head;
       while(tempNode.next!=null){
        tempNode=tempNode.next;
       }
       tempNode.next=newNode;
    }
    // printing
    public void printList(){
      if(head==null){
       System.out.println("List is empty");
      }
      Node tempNode = head;
      while(tempNode!=null){
        System.out.print(tempNode.data +"->");
        tempNode=tempNode.next;
      }
      System.out.println("null");
    }
    // delete first
    public void deleteFist(){
      if(head==null){
        System.out.println("The list is empty");
        return ;
      }
      size--;
      head = head.next;
    }
    // delete last
    public void deleteLast(){
      if(head==null){
        System.out.println("The list is empty");
        return ;
      }
      size--;
      if(head.next==null){
        head = null;
      }
      Node SecondLast = head;
      Node lastNode = head.next;
      while(lastNode.next!=null){
          lastNode = lastNode.next;
          SecondLast = SecondLast.next;
      }
      SecondLast.next = null;
    }
    public int getSize(){
      return size;
    }
    public void reverseIterate(){
      if(head==null || head.next==null){
        return;
      }
      Node preNode = head;
      Node currNode = head.next;
      while(currNode!= null) {
          Node nextNode = currNode.next;
          currNode.next = preNode;
          // update
          preNode = currNode;
          currNode = nextNode;

      }
      head.next=null;
      head = preNode;
    }
    public Node reverseRecursive(Node head){
      if(head==null || head.next==null){
        return head;
      }
       Node Newhead =  reverseRecursive(head.next);
       head.next.next = head;
       head.next = null;
       return Newhead;

    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("hello");
        list.addFirst("hai");
        list.printList();
        list.addLast("rocky");
        list.printList();
        //list.deleteFist();
       // list.printList();
       // list.deleteLast();
      // list.printList();
      // System.out.println(list.getSize());
       //list.reverseIterate();
       //list.printList();
        list.head = list.reverseRecursive(list.head);
        list.printList();

    }
    
}
