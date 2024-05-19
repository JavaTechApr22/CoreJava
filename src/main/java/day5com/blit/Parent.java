package day5com.blit;

public class Parent {
    // Super
//    protected : this access modifier can be access from subclass or in the same package
    protected String car = "Ford";

    public void honk() {
        System.out.println("pee pee pee");
    }

}
//         BankAccount  -> account, routingNumber, name
//              |
//         Checkings  - >
//              |
//         Savings    ->
