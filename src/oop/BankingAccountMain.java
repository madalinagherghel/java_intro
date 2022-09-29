package oop;

public class BankingAccountMain {
  public static void main(String[] args) {

        //initialise objects type BankingAccount
        //instances of class BankingAccount
        BankingAccount account1=new BankingAccount("Mada G","ROZBR001");
        BankingAccount account2=new BankingAccount("Anna A","ROZBR002");

        //call account_description method
        account1.soldQuery();
        account2.soldQuery();

        //activate accounts
      account1.accountActivation(7777);
      account1.accountActivation(6666);
      account2.accountActivation(3333);
      account2.accountActivation(7777);
      account2.accountActivation(6666);

      //card funding
      account1.cardFunding(1500);
      account2.cardFunding(1000);
      account2.cardFunding(500);

      //negative testing - check what happens if we spent more than we have
      account1.cardPayments(80000);

      //positive testing - boundary value analysis
      account1.cardPayments(1500);
      account2.cardPayments(500);


      //check account status
      account1.soldQuery();
      account2.soldQuery();
    }
}
