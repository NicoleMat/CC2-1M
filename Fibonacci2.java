import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a Term for Fibonacci");
        int t = keyboard.nextInt();
        System.out.println("The Term of " + term + " in Fibonacci is " + F(t));

    }

    public static int F(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return F(n - 1) + F(n - 2);
        }

    }
}
