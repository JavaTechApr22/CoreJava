package day9com.blit;

import java.util.Stack;

public class Stackintro {
    public static void main(String[] args) {
        //		   Stack<Datatype>  variableName  = new Stack<Datatype>();
                    Stack <String>    animals     = new Stack<>();

        animals.push("Lion");// on bottom // push means add
        animals.push("Dog");
        animals.push("Horse");//
        animals.push("Cat");//

        System.out.println(animals);

        animals.pop(); // pop means it will remove the last added
        System.out.println(animals);

        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals);
//      pop: removes the top
//        peek: shows the next in line
//        push : means adding the data in stack

//        Stack memory is epcial place in memory

    }
}
