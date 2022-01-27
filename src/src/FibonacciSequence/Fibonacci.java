package FibonacciSequence;

public class Fibonacci
{
    public static void main(String[] args)
    {
        Fibonacci fibonacci = new Fibonacci();
        for(int i = 0; i < 14; i++)
        {
           System.out.println(fibonacci.FibonacciSequence(i));
        }
    }

    int FibonacciSequence(int n)
    {
        if(n <= 1)
            return 1;

        else
            return FibonacciSequence(n - 1) + FibonacciSequence(n - 2);

    }


}
