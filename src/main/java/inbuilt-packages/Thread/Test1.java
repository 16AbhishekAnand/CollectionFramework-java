class Test1 {
    // Use of String args[].
    public static void main(String args[]) {
        // Print the number of command-line arguments
        System.out.println("Number of arguments: " + args.length);
        // Print each command-line argument
        for (int i = 0; i <args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
}
