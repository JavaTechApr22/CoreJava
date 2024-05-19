package day5com.blit;

public class OOPS {
    //		1. Encapsulation
    //		2. Inheritance
    //		3. Polymorphism
    //		4. Abstraction

//   Encapsulation:
//   Encapsulation, is to make sure that "sensitive" data is hidden from the users.
//   1. declare class variables/attributes as private.
//   2. we will create a set or get methods to access or update the values of private variables/attributes
//   Access modifier , Getters/ Setters

// 		2. Inheritance
//    it is possible to inherit attributes and methods from one class to another class
//
//     1. sub class or child class -> class that inherits from [another class] <-(this will be the parent class
//     or "super class" for this child or sub class)
//
//     2. super class or parent ------------------------------------|
//     using super key word we can access the parent methods or attributes.
//
//     To inherit from one class to another class , we will use keyword called "Extends"
//     for all the objects in java, parent class is Object class
//
// 		3. Polymorphism = Polymorphism uses those methods to perform different tasks.
//    poly= many
//    morphism = forms
//    1- compile time polymorphism = method overloading
//      method name -> same
//        different number of parameters with the same data type
//        within the same class

//    2-Run time polymorphism =  method overriding
//        @Override
//    method overriding will be used when there is 2 classes having inheritance
//     both having same method with different implementation
//over loading =
//    create a add method with different return types
//overriding =
//    class animal -> parent -> method cat(meow)
//    class dog -> child -> method cat (pee pee)
//    class fish -> grand child -> method cat (hi hi)
}
