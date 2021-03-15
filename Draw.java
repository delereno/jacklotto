import java.util.Collections;
/**
 * Write a description of class Draw here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Draw
{
    public static void main(String[] args)
    {
        duplicates(array(), guess());
    }
    public static int[] array()
    {
        final int BALLCOUNT = 4;
        
        int [] rolled = new int[BALLCOUNT];
        BallRoll ball = new BallRoll();
        for (int i = 0; i < 4; i++)
        {   
            ball.randomBall();
            rolled[i] = ball.number();
            System.out.println(ball.number());
        }
        System.out.println(" ");
        return rolled;
    }
    public static int[] guess()
    {
        final int BALLCOUNT = 4;
        
        int [] guess = new int[BALLCOUNT];
        BallRoll ball = new BallRoll();
        for (int i = 0; i < 4; i++)
        {   
            ball.randomBall();
            guess[i] = ball.number();
            System.out.println(ball.number());
        }
        System.out.println(" ");
        return guess;
    }
    public static boolean duplicates(int[] rolled, int[] guess)
    {
        boolean duplicates = false;
        for (int i = 0; i < rolled.length; i++) 
        {
            for (int j = i + 1 ; j < guess.length; j++) 
                {
                if (guess[i] == guess[j])
                { 
                    duplicates = true;
                }
                else
                {
                    duplicates = false;
                }
            }
        }
        System.out.println(duplicates);
        return duplicates;
    }
}
