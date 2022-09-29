import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // declaring an empty list
        List<String> fruits = new ArrayList<>();
        // if a word appears with red press Alt+Enter
        // list have a dynamic dimension
        // adding elements into the list
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        //how to get elements:
        fruits.get(2);
        // and print the element
        System.out.println(fruits.get(2));

        // how to find out the index of an element and print it:
        System.out.println(fruits.indexOf("apple"));

        // how to remove an element:
        fruits.remove("orange");

        // how to list elements of a list
        System.out.println(fruits);

        // how to find out if the list is empty:
        System.out.println(fruits.isEmpty());

        //how to find out the size of a list:
        System.out.println(fruits.size());

        // exercise: if fruits list is empty I do not have what to eat else I have
        if (!fruits.isEmpty()){
            System.out.println("I have what to eat");
        }else{
            System.out.println("I do not what food to eat");
        }

        //declaring an immutable list and initialise it with values
        List<String> students = Arrays.asList("Anna", "Bill","James");
        System.out.println(students);
        List<Integer> grades = Arrays.asList(10, 8, 7);
        System.out.println(grades);

        //declaring a dynamic list and initialise it with values
        String[] flowers = {"Daisy", "Poppy", "Lavender","Chamomile"};
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers));
        flowerList.add("Rose");
        System.out.println(flowerList);

        // how to find out index of an element
        // remove the element
        flowerList.remove("Rose");
        //print the list
        System.out.println(flowerList);
        // how to remove an element by its value and print it
        flowerList.remove("Lavender");
        System.out.println(flowerList);


    }
}
