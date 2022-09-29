import java.util.HashMap;
import java.util.Map;

public class Maps {
        public static void main(String[] args) {
            // map =   an object that maps keys to values
            // example : Anna has a grade of 9, Edi has a grade of grade 10
            //how to declare a map
            Map<String,Integer> student_grades = new HashMap<>();

            // how to add elements
            student_grades.put("Anna",9);
            student_grades.put("Edi", 10);
            student_grades.put("George", 8);

            //how to find out the grades
            System.out.println("Edi has a grade of" +" "+ student_grades.get("Edi"));

            // overwrite values
            student_grades.replace("George", 9);
            System.out.println("George has the new grade of "+ student_grades.get("George"));

            //how to find out the size of a map
            System.out.println(student_grades.size());

            //how to delete values
            student_grades.remove("Anna");
            System.out.println(student_grades);

            // how to declare and initialize a map
            // map is not ordered
            Map<String,Integer> months= new HashMap<>()
            {{
                put("january", 1);
                put("february", 2);
                put("march", 3);

            }};
            System.out.println(months);

    }
}
