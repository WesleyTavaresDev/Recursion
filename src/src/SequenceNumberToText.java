
public class SequenceNumberToText
{
    public static void main(String[] args)
    {
        PrintHorizontalNumbers(0);
    }

    public static String PrintHorizontalNumbers(int index)
    {
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6"};

        System.out.printf("%-2s", numbers[index]);
        index++;

        return (index == numbers.length - 1) ? null : PrintHorizontalNumbers(index);
    }
}
