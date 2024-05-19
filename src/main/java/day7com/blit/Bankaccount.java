package day7com.blit;

public abstract class Bankaccount {

    private int accountNumber;
    private int routingNumber;
    private String name;

    public void showintrest(int sum, double salary, String housingtype){
        calculateCreditScore();
        calculateNoOfLoans();
        creditLength();
    }

    private void calculateCreditScore(){
//abstract methods becausethey dont have a body.
    }
    private void calculateNoOfLoans(){

    }
    private void creditLength(){

    }
}
