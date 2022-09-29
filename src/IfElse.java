import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        //flow control - if
        // evalueaza conditii si bifurca codul in functie de rezultat
        System.out.println("turn on radio");
        boolean song_is_nice = true;
        //daca song_is_nice = false > nu mai intra in if
        //daca imi place piesa dau mai tare
        if (song_is_nice == true) {
            System.out.println("volume level up");
            System.out.println("sing it loudly");
        }
        System.out.println("turn off radio");

        // if else
        // if number is even print it
        //else print odd
        //even ? numbers are exactly divisible by 2; nr%2=0
        //odd  ? nr%2 != 0
        int nr = 25;
        if (nr % 2 == 0){
            System.out.println("number is even");
        }else {
            System.out.println("number is odd");
        }

        //if, else, else if
        // input data from keyboard
        Scanner sc = new Scanner(System.in);//helps us to input data from keyboard
        System.out.println("Please enter the hour: ");
        int hour = sc.nextInt();
        if (hour<0){
            System.out.println("Invalid hour ");
        }
        else if (hour <= 11){
            System.out.println("Good morning");
        }
        else if (hour <= 18){
            System.out.println("Good afternoon");
        }
        else if (hour <= 21){
            System.out.println("Good evening");
        }

        else if (hour <= 24){
            System.out.println("Good night");
        }
        else
            System.out.println("Invalid hour");
        //flow control switch
        //ex2 phone robot with options
        //switch - it is used when we know the possible options
        System.out.println("please choose the option");
        int option = sc.nextInt();
        switch (option) {
            case 0:
                System.out.println("previous menu");
                break;
            case 1:
                System.out.println("you chose ro");
                break;
            case 2:
                System.out.println("you chose eng");
                break;
            default:
                System.out.println("Invalid option");
        }
    } //close main function
} //close class
