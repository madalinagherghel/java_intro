public class For {
    public static void main(String[] args) {
        // for is a loop, a repetitive structure
        // questions: from where it starts? until where it goes?
        // pacing
        //exercise: print 101 dalmatians
        for (int i=1;i<=101;i++){
            System.out.println("Dalmatian number"+i);
        }
        //exercise 2 : traversing an array
        int[]numbers={3,5,48,58};
        for (int i=0;i<numbers.length;i++){
            System.out.println("element has a index of "+ i +" and a value of "+numbers[i]);
        }
        //for each-goes through all elements of array and get directly to the values
        for (int number:numbers) {
            System.out.println("number is:"+number);
        }
        //exercise: sum of numbers from an array
        int s=0;
        for (int number:numbers) {
            s=s+number;
        }
        System.out.println("sum is "+s);

    }
}
