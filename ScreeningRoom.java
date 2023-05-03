import java.util.Scanner;
/**
 * Write a description of class ScreeningRoom here.
 *
 * @author (Kevin Teixeira)
 * @version (May 5 2023)
 */
public class ScreeningRoom
{
    // instance variables - replace the example below with your own
    private int ScreeningRoom;
    private int seats;
    /**
     * Constructor for objects of class ScreeningRoom
     */
    public ScreeningRoom()
    {
        // initialise instance variables
        Scanner in = new Scanner(System.in);
        System.out.print("How many seats can we reserve?");
        int k = in.nextInt();
        System.out.print("How many seats are occupied?");
        int n = in.nextInt();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // Draw first array
        int[] seats = new int[seats];
        for (int i = 0; i < seats.length; i++)
        seats[i] = i + 1;
        
        //Draw second array
        int[] result = new int[seats];
        for (int i = 0; i < result.length; i++)
        System.out.println("Sorry, these seats are taken.");
}
}

