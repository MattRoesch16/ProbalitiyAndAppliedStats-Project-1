import java.util.*;
import java.io.*;
import java.lang.Math;
/**
 * GraphSmoother takes the average of the data around the point to smooth out the graph
 *
 * Author: Matthew Roesch
 * Version: 1.0
 * Date: 10/24/22
 */
public class GraphSmoother
{
    public static final String delimiter = ",";
    
    public GraphSmoother()
    {
        // Constructor
    }

    public String SmoothData(String csvFile)
    {
        try
        {
            Random rnd = new Random();
            File file = new File(csvFile);
            FileReader reader = new FileReader(file);
            BufferedReader brd = new BufferedReader(reader);
            FileWriter writer = new FileWriter("SmootherOutput.csv");
            BufferedWriter bwr = new BufferedWriter(writer);
            String line = "";
            String[] tempArray;
            bwr.write("X");
            bwr.write(",");
            bwr.write("Y");
            bwr.write("\n");
            int linenum = 0;
            int index = 0;
            ArrayList<Double> datasetx = new ArrayList<Double>();
            ArrayList<Double> datasety = new ArrayList<Double>();
            ArrayList<String[]> wholefile = new ArrayList<String[]>();
            while((line = brd.readLine()) != null)
            {
                tempArray = line.split(delimiter);
                wholefile.add(tempArray);
                if (linenum != 0)
                {
                    for(String tempString : wholefile.get(linenum))
                    {
                        if (index % 2 == 1)
                        {
                            Double data = Double.parseDouble(tempString);
                            datasety.add(data);
                        }
                        else
                        {
                            Double data = Double.parseDouble(tempString);
                            datasetx.add(data);
                        }
                        index ++;
                    }
                }
                linenum ++;
            }
            index = 0;
            for (int x = 0; x < datasety.size(); x ++)
            {
                Double sum = 0.0;
                Double avg = 0.0;
                for (int index1 = 0; index1 < 2; index++)
                {
                    if (index1 % 2 == 1)
                    {
                        if ((x - 2) >= 0 && (x + 2) < datasety.size())
                        {
                            for (int y = -2; y < 3; y ++)
                            {
                                sum = sum + datasety.get(x + y);
                            }
                            avg = sum / 5;
                            bwr.write("" + avg);
                            bwr.write(",");
                            System.out.println (avg);
                        }
                        else
                        {
                            if((x - 1) >= 0 && (x + 1) < datasety.size())
                            {
                                for (int y = -1; y < 2; y ++)
                                {
                                    sum = sum + datasety.get(x + y);
                                }
                                avg = sum / 3;
                                bwr.write("" + avg);
                                System.out.println (avg);
                            }
                            else
                            {
                                bwr.write("" + datasety.get(x));
                                System.out.println (avg);
                            }
                        }
                    }
                    else
                    {
                        bwr.write("" + datasetx.get(x));
                        bwr.write(",");
                        System.out.print (x + ", ");
                    }
                    index1 ++;
                }
                bwr.write("\n");
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
