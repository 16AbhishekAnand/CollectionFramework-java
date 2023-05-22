package framework.code.Arraylist_iterator;
// An enumeration of apple varieties.
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
   }
   class Enum {
    public static void main(String[] args)
    {
    // using enum as array.
    Apple ap;
    Apple[] app = Apple.values();
    for(Apple a : app) {
        System.out.print(a);
    }
    ap = Apple.valueOf("RedDel");
    System.out.println(app);
    ap = Apple.RedDel;
    // Output an enum value.
    System.out.println("Value of ap: " + ap);
    System.out.println();
    ap = Apple.GoldenDel;
    // Compare two enum values.
    if(ap == Apple.GoldenDel)
    System.out.println("ap contains GoldenDel.\n");
    // Use an enum to control a switch statement.
    ap=Apple.Jonathan;
    switch(ap) {
    case Jonathan:
    System.out.println("Jonathan is red.");
    break;
    case GoldenDel:
    System.out.println("Golden Delicious is yellow.");
    break;
    case RedDel:
    System.out.println("Red Delicious is red.");
    break;
    case Winesap:
    System.out.println("Winesap is red.");
    break;
    case Cortland:
    System.out.println("Cortland is red.");
    break;
    }
}
}