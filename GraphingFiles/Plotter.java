import java.util.*;
import java.io.*;
import java.lang.Math;
/**
 * Plotter outputs a csv file of a formula between two x values on a graph, and the interval
 *
 * Author: Matthew Roesch
 * Version: 1.0
 * Date: 10/21/22
 */
public class Plotter
{
    private int min;
    private int max;
    private int points;

    public Plotter(int little, int big, int amount)
    {
        min = little;
        max = big;
        points = amount;
    }

    public String PlotFunction()
    {
        try
        {
            FileWriter write = new FileWriter ("PlotterOutput.csv");
            BufferedWriter bwr = new BufferedWriter(write);
            bwr.write("X");
            bwr.write(",");
            bwr.write("Y");
            bwr.write("\n");
            System.out.println ("X, Y");
            Double y = 0.0;
            for (Integer x = min; x <= max; x = x + ((max - min) / points))
            {
                y = (Math.pow(x, 3) - Math.pow(x, 2) - x)/ 10;
                bwr.write("" + x);
                bwr.write(",");
                bwr.write("" + y);
                bwr.write("\n");
                System.out.println ("" + x + ", " + y);
            }   
            bwr.close();
        }
        catch (IOException ioe)
        {
                ioe.printStackTrace();
        }
        return "";
    }
}
