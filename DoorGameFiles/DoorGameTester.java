import java.util.*;
/**
 * DoorGameTester plays the door game both ways and outputs the win rates
 * 
 * Author: Matthew Roesch
 * Version: 2.0
 * Date: 10/21/22
 */
public class DoorGameTester
{
    public static void main (String[] args)
    {
        DoorGame game1 = new DoorGame();
        game1.playStay();
        System.out.println("Win percent by staying: " + game1.winPercent());
        game1.playSwitch();
        System.out.println("Win percent by switching: " + game1.winPercent());
    }
}
