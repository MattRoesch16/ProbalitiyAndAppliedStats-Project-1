import java.util.*;
/**
 * This class finds the probability that two people in a group have the same birthday
 * 
 * Author: Matthew Roesch
 * Version: 2.0
 * Date: 10/21/22
 */
public class SameBirthday
{
        public SameBirthday()
    {
        //Constructor
    }

        public double findProb(int people, double runs)
    {
        Person group[] = new Person[people];
        Random rnd = new Random();
        boolean match = false;
        double matchedRuns = 0;
        double result = 0;
        for (int j = 0; j < runs; j++)
        {
            for (int i = 0; i < group.length; i++)
            {
                group[i] = new Person(rnd.nextInt(365) + 1);
            }
            for (int a = 0; a < group.length; a ++)
            {
                for (int b = a + 1; b < group.length; b++)
                {
                    if (group[a].getDate() == group[b].getDate())
                    {
                        match = true;
                    }
                }
            }
            if (match == true)
            {
                matchedRuns++;
            }
            match = false;
        }
        result = matchedRuns / runs;
        return result;
    }
}
