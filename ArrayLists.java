import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        // adding the element
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);
        // get element
        int element = list.get(0);
        System.out.println(element);
      //  add el in between
        list.add(1,1);
        System.out.println(list);
        //set element
        list.set(0,4);
        // delete element
        list.remove(3);
        System.out.println(list);
        //size
        int size = list.size();
        System.out.println(size);
    // for loops
    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
    }
    // sorting
    System.out.println( );
     Collections.sort(list);
     System.out.print(list+" ");
    }
}
