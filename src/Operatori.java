public class Operatori {
    public static void main(String[] args) {
        /*
        Operators:
        arithmetic : +, - ,* , / , %
        comparator: < , > , ==, !=, >=, <=
        logic: &&, || , !
         */
        int a = 3; //declare && initialize
        int b = 5;
        a=b; //superscribe
        System.out.println(a); //5
        System.out.println(a+b); //5+5
        System.out.println(a-b); //5-5
        System.out.println(10%b); // 10%5 = 0
        System.out.println(a-1 >=b); // 4>=5 > false
        System.out.println(a != b); //5 differ from 5? > false
        System.out.println(7>b && 8>b); //7>5 and 8>5 > true
        System.out.println(7>b && 3>5); //7>5 and 3>5 > false
        System.out.println(7>b || 3>b); //7>5 or 3>5 > true
        System.out.println(7>b || (3>b && 7>b));//7>5 or (3>5 si 7>5)>true sau false>true
        System.out.println(!(7> b));// !true> false


    }
}
