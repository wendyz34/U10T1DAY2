import java.util.Scanner;

public class CountDown
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to start: ");
        int start = input.nextInt();
        System.out.println(countdown(start));
    }

    public static String countdown(int number)
    {
        // WRITE THIS RECURSIVE METHOD!
        if(number ==0){
            return "BlastOff!";
        }
        return number+ " " +countdown(number-1);
    }
}
