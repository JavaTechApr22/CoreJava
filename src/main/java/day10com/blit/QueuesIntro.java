package day10com.blit;

import java.util.*;

public class QueuesIntro {
    public static void main(String[] args) {
//        Queue
//        FIFO:
//        offer() -> add -> offer
//        poll()  -> remove
//        peek()  -> preview
//
//        Queue  <Integer> queue1 = new LinkedList<>();
//
//        queue1.offer(12);
//        queue1.offer(24);
//        queue1.offer(36);
//
//        System.out.println(queue1);
//        System.out.println(queue1.peek());
//        queue1.poll();
//        System.out.println(queue1);
//
//        PriorityQueue<Integer> queue2 = new PriorityQueue<>();
//        queue2.add(18);
//        queue2.add(40);
//        queue2.add(38);
//
//        System.out.println(queue2);
//
//        System.out.println(queue2.peek());


        Deque <Integer> queue3 = new ArrayDeque<>();

        queue3.add(23);
        queue3.add(45);
        queue3.add(55);

        queue3.addFirst(21);
        queue3.removeFirst();

        System.out.println(queue3.size());
        System.out.println(queue3);

//        addfirst
//        addlast
//        removefirst
//        removelast




    }
}
