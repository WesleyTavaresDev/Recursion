
public class SequenceNumberToText
{
    public static void main(String[] args)
    {
        PrintHorizontalNumbers(0);
    }

    public static String PrintHorizontalNumbers(int index)
    {
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6"};

        int i = index;
        System.out.printf("%-2s", numbers[index]);
        i++;

        if(index == numbers.length - 1)
        {
            return "";
        }

        else
        {
           return PrintHorizontalNumbers(i);
        }
    }
}
