package day7com.blit;

import java.util.Objects;

public class Day7 {
    public static void main(String[] args) {
//        String class:
//            Strings are immutable -> once a string is created its values can not be changed
//       when you modify a string -> it will actually create a new string

//        JAVA MEMORY JVM:
//
//        1- HEAP MEMORY:
//        -> java objects will be stored in heap, which is some portion of memory dedicated to storing objects and arrays
//        -> heap memory is shared among all threads in jvm

//        STACK MEMORY:
//        -> java uses stack memory to store local variables and methods call
//                method call means when you call a variable using a method
//        -> each thread in jvm has its own stack, which is used for method calls and local variables

        //        Strings can be created in 2 ways:
//
//               String a = "hey";// pool -> heap
//               String b = new String(); // heap
//
        String s1 = "hello world";
        String s2 = "hello world";

        String s3 = "hello world";
        String s4 = new String ("hello World");

//                is s2 equal to s3
//                true or false?
//                is s3 equal to s4
//                true or false
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);

        System.out.println(s4.equals(s3));

//        In Java, the final keyword is used to apply restrictions on classes, methods, and variables.
//        String s1 = "hello world";
        System.out.println(s1.length());

        System.out.println(s1.charAt(5));

        System.out.println(s1.indexOf('l'));

        System.out.println(s1.substring(4));

//        concatenation we use + operator
        System.out.println( "hey " + "how " + "are " + "you");

//        String builder and String buffer: -> mutable
//        -> this classes will allow you to modify without creating new objects each time
//        -> both classes will provide similar functionality,
//        but they differ in their thread safety
//
//        String builder :
//        -> its not thread safe
//        -> it means its not suitable for multithreading environment
//        -> however it is more efficient that string buffer
//        the reason is because of the thread safety condition

//        String buffer;
//        -> it is thread safe
//        -> it is situated for multithreading environment
//        -> however it is less efficient that string builder

        StringBuilder a = new StringBuilder();

        a.append("hello");
        a.append(" ");
        a.append("world");
        a.replace(0, 5, "my");
        System.out.println(a);

        StringBuffer b = new StringBuffer();
        b.append("bello");
        b.append(" ");
        b.append("contry");
        b.replace(0, 5, "my");
        System.out.println(b);

//       Abstraction :
//        its a process of hiding the certain details and implementations.
//          its achieved by 2 ways:
//        1- abstract class
//        2- interface
//        3- private methods

//        abstract class;
//      keyword: abstract
//      we can not create objects using abstract class
//        abstracts methods: those who dont have a body
//        abstract class have normal and abstract both methods
//
//        2- interface:
//      this is another way for achieving abstraction
//        we use keyword=  implements
//        we cannot create objects using interface
//        when any class implements an interface, that class should implement its methods
//      interface have abstract methods only
//        in interface -> methods -> by default-> public, attributes are -> static and final.

//        by using interface we can implement multiple inheritance



    }
}