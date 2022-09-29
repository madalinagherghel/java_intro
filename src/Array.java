public class Array {
    public static void main(String[] args) {
        // declaring and initializing
        String[] students = {"Rock", "Zora", "Nora", "Ely", "Ava"};
        int[] numbers = {1, 48, 48, 498};
        // contains elements of the same type
        // elements can be accessed by index, that starts from 0
        // has a size of a fixed length
        System.out.println(students[4]);
        students[2]="Sebastian";
        System.out.println(students[2]);
        // display length of array
        System.out.println(students.length);
        // print the last element of an array regardless of the array size
        System.out.println(students[students.length-1]);
        // declaring and memory allocation, for an array without initial values
        int[] grades = new int[5];
        grades[1]=8;
        grades[4]=7;




    }
}
