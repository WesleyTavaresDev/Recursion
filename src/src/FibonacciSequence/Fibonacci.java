package FibonacciSequence;
import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        Fibonacci fibonacci = new Fibonacci();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, digit a number: ");
        int fab = sc.nextInt();

        for(int i = 0; i < fab; i++)
           System.out.printf("%d°: %d %n", i + 1, fibonacci.FibonacciSequence(i));
        sc.close();
    }

    int FibonacciSequence(int n)
    {
        if(n <= 1)
            return 1;
        else
            return FibonacciSequence(n - 1) + FibonacciSequence(n - 2);
    }


}
