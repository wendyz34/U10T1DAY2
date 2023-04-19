import java.util.Scanner;

public class Bacteria
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many intital bateria?");
         int inital = input.nextInt();
        System.out.print("How many hours will the bacteria sit? ");
        int hours = input.nextInt();
        long bacteria = numBacteriaAlive(inital,hours);
        System.out.println("After " + hours + ", there will be " + bacteria + " bacteria");
    }

    public static long numBacteriaAlive(int inital,int hour)
    {
        // WRITE THIS METHOD to use RECURSION to find the number of bacteria!
        if (hour==0){
            return inital;
        }
        long numBac = numBacteriaAlive(inital,hour-1);
        return numBac+numBac*2;
    }
}

