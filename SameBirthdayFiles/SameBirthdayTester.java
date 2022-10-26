import java.util.*;
/**
 * SameBirthdayTester checks the probability that two people share a birthday in a group
 * 
 * Author: Matthew Roesch
 * Version: 2.0
 * Date: 10/21/22
 */
public class SameBirthdayTester
{
    public static void main (String[] args)
    {
        SameBirthday birthdaytest = new SameBirthday();
        System.out.println (birthdaytest.findProb(23,1000));
    }
}
