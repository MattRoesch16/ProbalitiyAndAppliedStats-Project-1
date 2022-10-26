import java.util.*;
import java.io.*;
/**
 * FishMarketTester creates two fish markets, one random, one weighted, and outputs them to csv files
 * 
 * Author: Matthew Roesch
 * Version: 2.0
 * Date: 10/21/22
 */
public class FishMarketTester
{
    public static void main (String[] args)
    {
        FishMarket randomMarket = new FishMarket (300);
        FishMarket weightMarket = new FishMarket (300,.50,.20,.15,.15);
        randomMarket.printMarket("FishMarketOutput.csv");
        System.out.println();
        weightMarket.printMarket("FishMarketWeightedOutput.csv");
    }
}