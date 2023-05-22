package framework.code.Arraylist_iterator;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
public class Lambda {
    interface A {
        void show();

        public static void main(String []args) {
            // implementing A interface with lambda expression also 'a' is variable here.
            A a =()-> {
                System.out.println("Syntax of lamda expression with interface");
            };
            a.show();

            ArrayList<String> obj = new ArrayList<String>();
            try (Scanner inp = new Scanner(System.in)) {
                obj.add(inp.nextLine());
                obj.add(inp.nextLine());
                obj.add(inp.nextLine());
                obj.add(inp.nextLine());
                obj.add(inp.nextLine());
            }
            // traversinng through foreach with lambda expression.
            obj.forEach((String x)->System.out.println(x));

        }
    }
}
