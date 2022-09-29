public class Functions {

    // function = a reusable portion of a program
    // we cannot use spaces in names
    // we cannot define a function inside another function

    //ex: do a simple function that prints an input on screen
    // does not have return
    // does not have parameters
    public static void printGreeting() {
        System.out.println("Good morning! ");
    }

    //ex2 : do a function that say hi to a client by his name
    //does not have return
    //needs parameters
    public static void printGreetingByName(String name, String surname) {
        System.out.println("Good evening, " + name + " " + surname);
    }

    //ex3 -do a function that calculates the average of 3 numbers
           //have return (the average), needs parameters
    public static double average(double a, double b, double c){
        return (a+b+c)/3;
    }

    //ex4: do a function that return pi value
           //have return, does not need parameters
    public static double piValue(){
        return 3.14;
    }


    public static void main(String[] args) {
        printGreeting(); //ctrl+click =>go to the body of function
        printGreetingByName("Anderson", "Maddie");
        System.out.println(average(5,15,5));
        double average1=average(151,15,15);
        double average2=average(44,5451,48);
        System.out.println(average1);
        System.out.println(average2);
        System.out.println(piValue());
    }
}
