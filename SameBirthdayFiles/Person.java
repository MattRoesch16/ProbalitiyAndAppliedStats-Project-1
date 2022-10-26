/**
 * Person creates an object with a birthday
 * 
 * Author: Matthew Roesch
 * Version: 2.0
 * Date: 10/21/22
 */
public class Person
{
    private int birthday;
    private int birthmonth;

    public Person(int date)
    {
        birthday = date;
        birthmonth = 1;
    }
    
    public int getDate()
    {
        return birthday;
    }
    
    private int dayNumber()
    {
        int daynum = 0;
        if (birthmonth > 12)
        {
            return 0;
        }
        if (birthday > 31)
        {
            return 0;
        }
        for (int i = 0; i < birthmonth; i++)
        {
            if (birthmonth < 8)
            {
                if (birthmonth % 2 == 1)
                {
                    daynum = daynum + 31;
                }
                else
                {
                    if (birthmonth == 2)
                    {
                        daynum = daynum + 28;
                    }
                    else
                    {
                        daynum = daynum +30;                        
                    }
                }
            }
            else
            {
                if (birthmonth % 2 == 0)
                {
                    daynum = daynum + 31;
                }
                else
                {
                    daynum = daynum + 30;
                }
            }
        }
        daynum = daynum + birthday;
        return daynum;
    }
}
