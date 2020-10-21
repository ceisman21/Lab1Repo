import java.util.Scanner;

public class ArrayListTester {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        ArrayList a = new ArrayList();
        System.out.println("This is the tester program fro ArrayList.java");

        //Test the get function of an empty array
        System.out.println("This should be Null: " + a.get(0));
        System.out.println();

        //Test the Set Function
        System.out.print("Give us a first input: ");
        a.set(0, s.next());

        //Test the add Function
        System.out.print("Give us a second input: ");
        a.add(s.next());
        System.out.println();

        //For the add and set methods, their outputs should be good. Also tests get and length
        System.out.println("This should be the first input you entered: " + a.get(0));
        System.out.println("This should be the second input you entered: " + a.get(1));
        System.out.println("This should be the length (2): " + a.size());
        System.out.println();

        //Test add at a point
        System.out.print("Give us an input to go between the two we just defined: ");
        a.add(1, "Not");
        System.out.println();
        System.out.println("This should be the first input you entered: " + a.get(0));
        System.out.println("This should be the input you JUST entered: " + a.get(1));
        System.out.println("This should be the second input you entered: " + a.get(2));
        System.out.println("This should be the length (3): " + a.size());

        //Test Remove
        System.out.println();
        System.out.println("Now we will test remove, by removing the last index");
        a.remove(2);
        System.out.println("This should be the length (2): " + a.size());
        System.out.println("This should be the first input you entered: " + a.get(0));
        System.out.println("This should be the input you JUST entered: " + a.get(1));
    }
}
