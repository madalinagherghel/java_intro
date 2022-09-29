public class While {
    public static void main(String[] args) {
        // while - is a loop used to repeat a specific block of code an unknown number of times, until a condition is met
        //exercise : the car run till it runs out of gasoline
        int gasoline_liters = 10;
        while (gasoline_liters>0){
            System.out.println("accelerate");
            gasoline_liters=gasoline_liters-1;
            if (gasoline_liters<=3){
                System.out.println("Warning, you have less than 3 l");
            }
        }
        System.out.println("Stop! You run out of gasoline");
    }
}
