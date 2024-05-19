package day5com.blit;

public class Child extends Parent{
    //    first step: is always creating an object
//    Parent newCar = new Parent();
    @Override
    public void honk() {
        System.out.println("this is from child class");
    }

}