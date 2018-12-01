import java.util.*;
public class Fibonacci {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    	
	System.out.println("Enter a number: ");
	int n = sc.nextInt();
        int t1 = 0, t2 = 1;
        
        System.out.print("Upto " + n + ": ");
        while (t1 <= n)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}