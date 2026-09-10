package chapter_four;

// chapter_four;
public class Exercise04_01
{
    public static void main(String[] args)
    {
        PrintCodeword.getInstance().setCharacter('D');
        PrintCodeword.getInstance().setDigit(5);
        PrintCodeword.getInstance().printCode();
    }
}
