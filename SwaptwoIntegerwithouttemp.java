public class SwaptwoIntegerwithouttemp {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        System.out.println("Values before swapping: ");
        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);

        a = a+b; //25
        b = a-b; // 10
        a = a-b; // 15

        System.out.println("Values After swapping: ");
        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);



        
    }
}
