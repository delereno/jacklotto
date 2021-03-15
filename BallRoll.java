
/**
 * Write a description of class BallRoll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BallRoll
{
    private final int MINIMUM = 1;
    private final int MAXIMUM = 40;
    private int randomBall;
    
    public BallRoll() 
    {
      randomBall();  
    }
    public void randomBall()
    {
        randomBall = MINIMUM + (int) (Math.random() * MAXIMUM);
    }
    public int number()
    {
        return randomBall;
    }
}
