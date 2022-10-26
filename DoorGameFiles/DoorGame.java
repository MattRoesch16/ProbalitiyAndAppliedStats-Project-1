import java.util.*;
/**
 * DoorGame provides the different ways to play the door game
 * 
 * Author: Matthew Roesch
 * Version: 2.0
 * Date: 10/21/22
 */
public class DoorGame
{
    private int totalGames;
    private int winCount;
    Random rnd = new Random();
    
    public DoorGame()
    {
        totalGames = 10000;
        winCount = 0;
    }
    
    //Plays the door game by always staying on the orignial door picked
    public void playStay()
    {
        int pick;
        int win;
        int currentCount = 0;
        while (currentCount < totalGames)
        {
            pick = rnd.nextInt(3);
            win = rnd.nextInt(3);
            if (pick == win)
            {
                winCount++;
            }
            currentCount++;
        }
    }
    
    //Plays the door game by always switching to another door.
    public void playSwitch()
    {
        int pick;
        int win;
        int temp;
        int removed;
        int currentCount = 0;
        while (currentCount < totalGames)
        {
            pick = rnd.nextInt(3);
            win = rnd.nextInt(3);
            temp = rnd.nextInt(3);
            while ((temp == pick) || (temp == win))
            {
                temp = rnd.nextInt(3);
            }
            removed = temp;
            temp = pick;
            while ((temp == pick) || (temp == removed))
            {
                temp = rnd.nextInt(3);
            }
            pick = temp;
            if (pick == win)
            {
                winCount++;
            }
            currentCount++;
        }
    }
    
    public double winPercent()
    {
        double winCountD = winCount;
        double totalGamesD = totalGames;
        double winRate = winCountD/totalGamesD;
        winCount = 0;
        return winRate;
    }
}
