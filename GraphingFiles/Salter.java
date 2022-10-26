import java.util.*;
import java.io.*;
import java.lang.Math;
/**
 * Salter takes in a csv file, salts the data in the y column, and returns a new csv file with the salted data.
 *
 * Author: Matthew Roesch
 * Version: 1.0
 * Date: 10/14/22
 */
public class Salter
{
    public static final String delimiter = ",";

    public Salter()
    {
        //Constructor
    }

    public String SaltData (String csvFile, int maxinc, int maxdec)
    {
        try
        {
            Random rnd = new Random();
            File file = new File(csvFile);
            FileReader reader = new FileReader(file);
            BufferedReader brd = new BufferedReader(reader);
            FileWriter writer = new FileWriter("SalterOutput.csv");
            BufferedWriter bwr = new BufferedWriter(writer);
            String line = "";
            String[] tempArray;
            bwr.write("X");
            bwr.write(",");
            bwr.write("Y");
            bwr.write("\n");
            int linenum = 0;
            while((line = brd.readLine()) != null)
            {
                tempArray = line.split(delimiter);
                int index = 0;
                if (linenum != 0)
                {
                    for(String tempString : tempArray)
                    {
                        if (index % 2 == 1)
                        {
                            Double data = Double.parseDouble(tempString);
                            Double change;
                            if (rnd.nextInt(2) == 0)
                            {
                                change = data - (rnd.nextInt((maxdec + 1)));
                            }
                            else
                            {
                                change = data + rnd.nextInt((maxinc + 1));
                            }
                            bwr.write("" + change);
                            bwr.write(",");
                            System.out.println ("" + change);
                        }
                        else
                        {
                            bwr.write(tempString);
                            bwr.write(",");
                            System.out.print (tempString + ", ");
                        }
                        index ++;
                    }
                    bwr.write("\n");
                }
                linenum ++;
            }
            brd.close();
            bwr.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        return "";
    }
}
