import java.util.*;
/**
 * StatisticExamples provides methods to show different examples of statistic calculations and theorems
 *
 * Author: Matthew Roesch
 * Version: 1.0
 * Date: 10/21/22
 */
public class StatisticsExamples
{
    StatisticsLibrary stats;
    /**
     * Constructor for objects of class StatisticsExamples
     */
    public StatisticsExamples()
    {
         stats = new StatisticsLibrary();
    }

    /**
     * The following method provides an example for set operation
     */
    public String getSetOperationExample()
    {
        ArrayList<Integer> set = new ArrayList<>();
        for (int i = 0; i < 10; i ++)
        {
            set.add(i);
        }
        ArrayList<Integer> subset1 = new ArrayList<Integer>();
        for (int i = 0; i < 6; i ++)
        {
            subset1.add(i);
        }
        System.out.println ();
        ArrayList<Integer> subset2 = new ArrayList<Integer>();
        for (int i = 9; i > 4; i --)
        {
            subset2.add(i);
        }
        System.out.println ("Set S " + set);
        System.out.println ("Subset A " + subset1);
        System.out.println ("Subset B " + subset2);
        System.out.println("Union of subset A an B: " + stats.unionOf(subset1, subset2));
        System.out.println("Intersection of subset A and B:" + stats.intersectionOf(subset1, subset2));
        System.out.println("Compliment of subset A: " + stats.complimentOf(set, subset1));
        System.out.println("Difference of subset A and B: " + stats.differenceOf(subset1,subset2));
        return "";
    }
    
    /**
     * The following method provides an example for central tendencies and variation
     */
    public String getCentralTendencyAndVariationExample()
    {
        double [] testDataSet1 = {1,2,3,3,1,5,5,4,5,6};
        int [] testDataSet2 = {1,2,3,3,1,5,5,4,5,6};
        System.out.print ("Data Set: [");
        for (int i = 0; i < testDataSet1.length; i++)
        {
            System.out.print (testDataSet1[i] + ", " );
        }
        System.out.print ("] \n");
        System.out.println("Set Mean: " + stats.getMean(testDataSet1));
        System.out.println("Set Median: " + stats.getMedian(testDataSet1));
        System.out.println("Set Mode: " + stats.getMode(testDataSet2));
        System.out.println("Set Standard Deviation: " + stats.getStandardDeviation(testDataSet1));
        return "";
    }
    
    /**
     * The following method provides an example for factorials, combinations, and permutations
     */
    public String getFactAndCombAndPermExample()
    {
        System.out.println("Factorial of 5: " + stats.getFactorial(5));
        System.out.println("Combination of 8 and 3: " + stats.getCombination(8, 3));
        System.out.println("Permutation of 8 and 3: " + stats.getPermutation(8, 3));
        return "";
    }
    
    /**
     * The following method provides an example for probability distributions
     */
    public String getProbabilityDistributionExample()
    {
        System.out.println (stats.getProbabilityDistribution(12, 7, 5, 4, 0));
        System.out.println (stats.getProbabilityDistribution(12, 7, 5, 4, 1));
        System.out.println (stats.getProbabilityDistribution(12, 7, 5, 4, 2));
        return "";
    }
    
    /**
     * The following method provides an example for binomial distributions
     */
    public String getBinomialDistributionExample()
    {
       System.out.println (stats.getBinomialDistribution(.7, .3, 5, 5));
       System.out.println (stats.getBinomialDistExpected(.7, 5));
       System.out.println (stats.getBinomialDistVariance(.7, .3, 5));
       return "";
    }
    
    /**
     * The following method provides an example for geometric distributions
     */
    public String getGeometricDistributionExample()
    {
        System.out.println (stats.getGeoDistribution(.1, 3));
        System.out.println (stats.getGeoDistBefore(.1, 3));
        System.out.println (stats.getGeoDistOnBefore(.1, 3));
        System.out.println (stats.getGeoDistAfter(.1, 3));
        System.out.println (stats.getGeoDistOnAfter(0.1, 3));
        return "";
    }
    
    /**
     * The following method provides an example for hyper geometric distributions
     */
    public String getHyperGeometricDistributionExample()
    {
        System.out.println (stats.getHyperGeoDistribution(10, 5, 6, 5));
        System.out.println (stats.getHyperGeoDistExpected(10, 5, 6));
        System.out.println (stats.getHyperGeoDistVariance(10, 5, 6));
        return "";
    }
    
    /**
     * The following method provides an example for poisson distributions
     */
    public String getPoissonDistributionExample()
    {
        System.out.println (stats.getPoissonDistribution(1, 0));
        System.out.println (stats.getPoissonDistribution(1, 1));
        System.out.println (stats.getPoissonDistribution(1, 2));
        System.out.println (stats.getPoissonDistribution(1, 3));
        System.out.println (stats.getPoissonDistExpected(1));
        System.out.println (stats.getPoissonDistVariance(1));
        return "";
    }
    
    /**
     * The following method provides an example for chebysheff theorems
     */
    public String getChebysheffExample()
    {
        System.out.println(stats.getGreaterChebysheff(2));
        System.out.println(stats.getLesserChebysheff(2));
        return "";
    }
}
