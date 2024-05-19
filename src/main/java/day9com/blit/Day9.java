package day9com.blit;

public class Day9 {
    public static void main(String[] args) {

//        classname type objname = new classname
                GenericsClass <Integer> obj1 = new GenericsClass<>(9);
                System.out.println(obj1.getData());


        GenericsClass <String> obj2 = new GenericsClass<>("Age");
        System.out.println(obj2.getData());

        GenericsClass<Double> obj3 = new GenericsClass<Double>(5.5);




    }
}
