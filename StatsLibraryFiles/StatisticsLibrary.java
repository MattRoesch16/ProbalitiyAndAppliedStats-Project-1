import java.util.*;
import java.lang.Math;
import java.io.*;
/**
 * StatisticsLibrary contain all useful calculations used during the first half of the semester
 * 
 * Author: Matthew Roesch
 * Version: 2.0
 * Date: 10/21/22
 */
public class StatisticsLibrary
{
        public StatisticsLibrary()
    {
        //Constructor
    }
    
    /**
     * Following methods of code are set operations
     * 
     * complimentOf()
     * unionOf()
     * intersectionOf()
     * differenceOf()
     * 
     */
    
    //Returns an arraylist of integers that are the compliment of the given arralist of integer
    public ArrayList<Integer> complimentOf(ArrayList<Integer> numberset, ArrayList<Integer> subset)
    {
       ArrayList<Integer> result = new ArrayList<>();
       for (int singleElement : numberset)
        {
            if (!(subset.contains(numberset.get(singleElement))))
            {
                result.add(numberset.get(singleElement));
            }
        }
        return result;
    }
    
    //Returns an arraylist of integers that are the union of two integer arraylist
    public ArrayList<Integer> unionOf(ArrayList<Integer> subsetA, ArrayList<Integer> subsetB)
    {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < subsetA.size(); i++)
        {
            result.add(subsetA.get(i));
        }
        for (int j = 0; j < subsetB.size(); j++)
        {
            if ((result.contains(subsetB.get(j))) == false)
            {
                result.add(subsetB.get(j));
            }
        }
        return result;
    }
    
    //Returns an arraylist of integers that are the intersection of two given integer arraylist
    public ArrayList<Integer> intersectionOf(ArrayList<Integer> subsetA, ArrayList<Integer> subsetB)
    {
        ArrayList <Integer> result = new ArrayList<>();
        for (int singleElement : subsetA)
        {
            if (subsetB.contains(subsetA.get(singleElement)))
            {
                result.add(subsetA.get(singleElement));
            }
        }
        return result;
    }
    
    //Returns an arraylist of integers that are the difference of the given two arralist of integers
    public ArrayList<Integer> differenceOf (ArrayList<Integer> subsetA, ArrayList<Integer> subsetB)
    {
        ArrayList<Integer> result = new ArrayList<>();
        for (int singleElement : subsetA)
        {
            if (!(subsetB.contains(subsetA.get(singleElement))))
            {
                result.add(subsetA.get(singleElement));
            }
        }
        return result;
    }
    
    /**
     * The following methods are general measures of central tendency and variation
     * 
     * getMean()
     * getMedian()
     * getMode()
     * getStandardDeviation()
     * 
     */
    
    //Returns the mean of a dataset of doubles
    public double getMean(double [] dataset)
    {
        double setSum = 0;
        int setSize = dataset.length;
        for (int i = 0; i < setSize; i++)
        {
            setSum = setSum + dataset[i];
        }
        return setSum / setSize; 
    }
    
    //Returns the median of a dataset of doubles
    public double getMedian(double [] dataset)
    {
        Arrays.sort(dataset);
        double setSize = dataset.length;
        if (setSize % 2 != 0)
        {
            double middle = setSize / 2;
            return dataset[(int)middle];
        }
        double upperMiddle = (setSize / 2);
        double lowerMiddle = (setSize / 2) - 1;
        double middleSum = dataset[(int)upperMiddle] + dataset[(int)lowerMiddle];
        return middleSum / 2;
    }
    
    //Returns the mode of an int dataset
    public int getMode (int [] dataset)
    {
        Arrays.sort(dataset);
        double setSize = dataset.length;
        int testFrequent = 0;
        int countTest = 1;
        int mostFrequent = 0;
        int countMax = 1;
        int count3 = 1;
        for (int i = 0; i < setSize; i++)
        {
            testFrequent = dataset[i];
            countTest = 0;
            
            for (int j = i + 1; j < setSize; j++)
            {
                if (testFrequent == dataset[j])
                {
                    countTest++;
                }
            }
            if (countTest > countMax)
            {
                mostFrequent = testFrequent;
                countMax = countTest;
            }
            else
            {
                if(countTest == countMax)
                {
                    count3 = countTest;
                }
            }
        }
        if (count3 == countMax)
        {
            System.out.print ("No Mode Availible: Returns ");
            return 0;
        }
        return mostFrequent;
    }
    
    //Returns the standard deviation of a double dataset as a double
    public double getStandardDeviation(double[] dataset)
    {
        double sum = 0;
        double avg = 0;
        double setSum = 0;
        double result = 0;
        for (int i = 0; i < dataset.length; i++)
        {
            setSum = setSum + dataset[i];
        }
        avg = setSum /dataset.length; 
        for (double j : dataset)
        {
            sum = sum + ((dataset[(int)j] - avg) * (dataset[(int)j] - avg));
        }
        result = Math.sqrt(sum / (dataset.length - 1));
        return result;
    }
    
    /**
     * Following methods provides useful calculations
     * 
     * getFactorial()
     * getCombination()
     * getPermutation()
     * 
     */
    
    //returns the factorial of an int as an int
    public int getFactorial(int x)
    {
        int result = 1;
        int temp = x;
        while (temp > 0)
        {
            result = result * temp;
            temp --;
        }
        return result;
    }
    
    //Returns the combination of two doubles as a double
    public double getCombination(double n, double r)
    {
        double result;
        double numerator = (this.getFactorial((int)n));
        double denominator = (this.getFactorial((int)r)) * (this.getFactorial((int)(n - r)));
        result = numerator / denominator;
        return result;
    }
    
    //Returns the permutation of two doubles as a double
    public double getPermutation(double n, double r)
    {
        double result;
        double numerator = this.getFactorial((int)n);
        double denominator = this.getFactorial((int)(n - r));
        result = numerator / denominator;
        return result; 
    }
    
    /**
     * The following methods provide calculations for probability distributions
     * 
     * getProbabilityDistribution()
     * 
     */
    
    //Returns the probability distribution as a double
    public double getProbabilityDistribution (int max, int pop1, int pop2, int selected, int y)
    {
        double result;
        double numerator = this.getCombination(pop1, y) * this.getCombination(pop2, (selected - y));
        double denominator = this.getCombination(max, selected);
        result = numerator / denominator;
        return result;
    }
    
    /**
     * The following methods provide calculations for binomial distritbutions
     * 
     * getBinomialDistribution()
     * getBinomialDistExpected()
     * getBinomialDistVariance()
     * 
     */
    
    //Returns the binomial distribution probability as a double
    public double getBinomialDistribution(double p, double q, int n, int y)
    {
        double result = 0;
        int x = n - y;
        double comb = this.getCombination(n,y);
        result = comb * Math.pow(p, y) * Math.pow(q, x);
        return result;
    }
    
    //Returns the binomial distribution expected as a double
    public double getBinomialDistExpected(double p, int n)
    {
        double result = n * p;
        return result;
    }
    
    //Return the binomial distribution variance as a double
    public double getBinomialDistVariance (double p, double q, int n)
    {
        double result = n * p * q;
        return result;
    }
    
    /**
     * The following methods provide calculations for geometric distributions
     * 
     * getGeoDistribution()
     * getGeoDistBefore()
     * getGeoDistOnBefore()
     * getGeoDistAfter()
     * getGeoDistOnAfter()
     * getGeoDistExpected()
     * getGeoDistVariance()
     * 
     */
    
    //Returns the geometric distribution on a given number as a Double
    public Double getGeoDistribution(double p, double y)
    {
        Double result = Math.pow((1-p), (y-1)) * p;        
        return result;
    }
    
    //Returns the geometric distribution before a given number as a Double
    public Double getGeoDistBefore(double p, double y)
    {
        Double result = 1 - (Math.pow((1-p), (y-1)));
        return result;
    }
    
    //Returns the geometric distribution on or before a given number as a Double
    public Double getGeoDistOnBefore(double p, double y)
    {
        Double result = 1 - (Math.pow((1-p), y));
        return result;
    }
    
    //Returns the geometric distribtion after a given number as a Double
    public Double getGeoDistAfter(double p, double y)
    {
        Double result = Math.pow((1-p), y);
        return result;
    }
    
    //Reutns the geometric distribution on or after a given number as a Double
    public Double getGeoDistOnAfter(double p, double y)
    {
        Double result = Math.pow((1-p), (y-1));
        return result;
    }
    
    //Returns the geometric distribution's expected as a Double
    public Double getGeoDistExpected(double p)
    {
        Double result = 1 / p;
        return result;
    }
    
    //Reutns the geometric distribution's variance as a Double
    public Double getGeoDistVariance(double p)
    {
        Double result = (1 - p) / (Math.pow(p, 2));
        return result;
    }
    
    /**
     * The following methods provide calculations for hyper geometric distributions
     * 
     * getHyperGeoDistribution()
     * getHyperGeoDistExpected()
     * getHyperGeoDistVariance()
     * 
     */
    
    //Returns the hyper geometric distribution as a Double
    public double getHyperGeoDistribution(int N, int m, int r, int y)
    {
        double result;
        double denominator = this.getCombination(N, m);
        double numerator = this.getCombination(r, y) * this.getCombination((N-r), (m-y));
        result = numerator / denominator;
        return result;
    }
    
    //Returns the hyper geometric distribution expected as a Double
    public Double getHyperGeoDistExpected (int N, int m, int r)
    {
        Double result = (double)(m * r) / (double)N;
        return result;
    }
    
    //Returns the hyper geometric distribuiton variance as a Double
    public Double getHyperGeoDistVariance (int N, int m, int r)
    {
        Double result = (double)m * ((double)r / (double)N) * (((double)(N - r) / (double)N) * ((double)(N-m) / (double)(N-1)));
        return result;
    }
    
    /**
     * The following methods provide calculations for poisson ditributions
     * 
     * getPoissonDistribution()
     * getPoissonDistExpected()
     * getPoissonDistVariance()
     * 
     */
    
    //Returns the poisson distribution as a Double
    public Double getPoissonDistribution (int l, int y)
    {
        Double result;
        int fact = this.getFactorial (y);
        result = (double)l / (double)fact;
        result = result * Math.exp(-l);
        return result;        
    }
        
    //Returns the poissson distribution expected as an int
    public int getPoissonDistExpected (int l)
    {
        return l;
    }
    
    //Returns the poissson distribution variance as an int
    public int getPoissonDistVariance (int l)
    {
        return l;
    }
    
    /**
     * The following methods provide calculations for chebysheff theorems
     * 
     * getGreaterChebysheff()
     * getLesserChebysheff()
     * 
     */
    
    //Returns the chebysheff when greater than or equal to 1 as a double
    public double getGreaterChebysheff (double k)
    {
        double result = 1 - (1 / Math.pow(k, 2));
        return result;
    }
    
    //Returns the chebysheff when lesser than 1 as a double
    public double getLesserChebysheff (double k)
    {
        double result = 1 / Math.pow(k, 2);
        return result;
    }
}
