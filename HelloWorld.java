public class HelloWorld {

    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        System.out.println("Hello, World!");

        // Unused variable (issue)
        int unused = 5;

        // Bad practice: no check for division by zero
        int result = x / y;
        System.out.println("Result: " + result);

        // Poor naming convention
        int A = 5;
        int B = 10;
        System.out.println(A + B);

        // Duplicate code
        System.out.println("Duplicate line");
        System.out.println("Duplicate line");

        // Null pointer risk
        String text = null;
        System.out.println(text.length());
    }
}
