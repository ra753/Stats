import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        double ratio=1.09;
        int n=6;
        double p=ratio/(1+ratio);
        double prob=0;
        //Calculate Probabillity
        for(int x=3;x<=n;x++)
        {
            
                prob=binomial(n,p,x);
        }

        System.out.format("%.3f0" , prob);
    }

    public static double binomial(int n, double p,int x)
    {
        double q=1-p;
        if(p<0 || p>1 || x<0 || n<0 || n<x)
            {
                return 0;
            }
        else
        return combination(n,x)*Math.pow(p,x)*Math.pow(q,n-x);
        
    }

    static double combination(int n,int x)
    {
        if(n<0 || x<0 || x>n)
        {
            return 0;
        }
        else
          return factorial(n)/factorial(x)*(n-x);
    }

    static int factorial(int n)
    {
        int fact=1;
        for(int i=0;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }

}