import java.util.*;
import java.io.*;;
/**
 * FishMarket creates a list of different types of seafood
 * 
 * Author: Matthew Roesch
 * Version: 2.0
 * Date: 10/21/22
 */
public class FishMarket
{
    private int marketSize;
    private ArrayList<Seafood> marketItems;
    Random rnd = new Random();
    
    //Constructor for random FishMarket
    public FishMarket(int size)
    {
        marketSize = size;
        marketItems = new ArrayList<Seafood>();
        int seafoodType;
        for (int i = 0; i < marketSize; i++)
        {
            seafoodType = rnd.nextInt(4);
            if (seafoodType == 0)
            {
                marketItems.add(new Fish(i));
            }
            else
            {
                if(seafoodType == 1)
                {
                    marketItems.add(new Shrimp(i));
                }
                else
                {
                    if(seafoodType == 2)
                    {
                        marketItems.add(new Scallop(i));
                    }
                    else
                    {
                        marketItems.add(new Crab(i));
                    }
                }
            }
        }
    }

    //Constructor for weighted FishMarket
    public FishMarket(int size, double fishw, double shrimpw, double scallopw, double crabw)
    {
        marketSize = size;
        marketItems = new ArrayList<Seafood>();
        double seafoodType;
        for (int i = 0; i < marketSize; i++)
        {
            seafoodType = rnd.nextDouble();
            if (seafoodType < fishw)
            {
                marketItems.add(new Fish(i));
            }
            else
            {
                if(seafoodType >= fishw && seafoodType < (shrimpw + fishw))
                {
                    marketItems.add(new Shrimp(i));
                }
                else
                {
                    if(seafoodType >= (shrimpw + fishw) && seafoodType < (scallopw + shrimpw + fishw))
                    {
                        marketItems.add(new Scallop(i));
                    }
                    else
                    {
                        marketItems.add(new Crab(i));
                    }
                }
            }
        }
    }
    
    public void printMarket(String filename)
    {
        try
        {
            FileWriter writer = new FileWriter(filename);
            BufferedWriter bwr = new BufferedWriter(writer);
            bwr.write ("Index");
            bwr.write (",");
            bwr.write ("Type");
            bwr.write (",");
            bwr.write ("Weight");
            bwr.write (",");
            bwr.write ("Price");
            bwr.write ("\n");
            for (int i = 0; i < marketSize; i++)
            {
                String temp = "" + (i + 1);
                bwr.write(temp);
                bwr.write (",");
                bwr.write (marketItems.get(i).getType());
                bwr.write (",");
                bwr.write (marketItems.get(i).getWeight());
                bwr.write (",");
                bwr.write (marketItems.get(i).getPrice());
                bwr.write ("\n");
                System.out.println(marketItems.get(i).toString());
            }
            bwr.close();
        }
        catch (IOException ioe)
        {
                ioe.printStackTrace();
        }
    }
}
