package oop;

public class BankingAccount {
    // oop (object-oriented programming)
    //a class= is a new type
    //definition of a concept
    //analogy:it is like a recipe (recipe for carbonara pasta)
    //an object = a class instance
    //analogy: carbonara pasta
    // field=property=attribute
    //variable
    //ex: object type car, properties: colour, type,price
    //methods = actions that can be done by objects
    //functions
    //ex: accelerate(), open-door(), brake()
    String name;
    String iban;
    double sold =0;
    boolean active = false;
    private int pin = 6666;
    int activation_try=0;
    // we use private when we want to hide certain attributes

    //constructor = a special method used to initialize objects
    //analogy: like * from a form-required fields
    //how to generate a constructor: Right click>Generate>Constructor>Select objects
    public BankingAccount(String name, String iban) {
        this.name = name;
        this.iban = iban;
    }

    //methods : actions of classes
    public void soldQuery(){
        System.out.println("Account name " + this.name);
        System.out.println("IBAN is " + this.iban);
        System.out.println("Deposit amount is "+ this.sold);
        System.out.println("Account status is " + this.active);
        System.out.println("number of wrong try:"+this.activation_try);
        System.out.println("------------------------");
    }
    public void accountActivation(int user_pin){
        //to make the status account active, only if pin is correct
        System.out.println("Hello!"+ this.name);
        if (user_pin==this.pin){
            System.out.println("Account is successfully activated");
            this.active=true;
        }else{
            System.out.println("Wrong pin! ");
            this.activation_try++;  //increment
        }
    }
    public void cardFunding(double sum){
        // we add to this.deposit_amount + sum(this sum we are funding the card)
        this.sold = this.sold +sum;
        System.out.println("Hello!"+ this.name);
        System.out.println("Successfully card funding.Your currently card amount is " + this.sold);
    }
    public void cardPayments(double spent_sum){
        // I can spent only money that I have
        if(spent_sum<=this.sold) {
            this.sold = this.sold - spent_sum;
            System.out.println("You spent:" + spent_sum);
            System.out.println("You have left:" + this.sold);
        }else{
                System.out.println("Insufficient sold");
            }

    }
}
