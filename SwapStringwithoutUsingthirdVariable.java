public class SwapStringwithoutUsingthirdVariable {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";

        System.out.println("String before swapping: ");
        System.out.println("The value of a is: " + a );
        System.out.println("The Value of b is: " + b);

        a = a+b; // HelloWorld;

        b = a.substring(0,a.length()-b.length());
        a = a.substring(b.length());

        System.out.println("String After swapping: ");
        System.out.println("The value of a is: " + a );
        System.out.println("The Value of b is: " + b);
    }
}
