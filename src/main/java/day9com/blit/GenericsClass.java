package day9com.blit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;



public class GenericsClass<T> {
//    Java Generics allows us to create a single class, interface, and method
//    that can be used with different types of data (objects).

//    private int data;
//    private int age;
    private T data;
    public T getData() {
        return this.data;
    }

    public GenericsClass(T data) {
        this.data = data;
    }
// create a DemoClass
public  void method1() {
    System.out.println(data);
}
// Arrays:
//    cons:
// fixed in size
//

//			 Collection:
//			2. List          ->  Arraylist, Linkedlist, Stack
//			3. Set           ->  Hashset, LinkedHashSet
//			4. SortedSet     ->  TreeSet
//      	5. Queue         -> Queue, PriorityQueue, DoubleEndedQueue(Deque)
//    -----------------------------------------------------------------------------------


//    List vs Set:-
//    List allows duplicate data
//    List follows the insertion order

//    set does not allow duplicate data
//    set does not follow the insertion order



}
