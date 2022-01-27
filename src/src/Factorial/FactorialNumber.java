package Factorial;

public class FactorialNumber
{
    public static void main(String[] args)
    {
        FactorialNumber fact  = new FactorialNumber();

        System.out.println(fact.Factorial(3));
    }

    int Factorial(int number)
    {
        if(number <= 1)
            return 1;
        else
            return number * Factorial(number - 1);
    }
}
