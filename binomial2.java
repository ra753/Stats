import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int n=10; 
        Double p=0.12;

        //Calculating Binomial

        //Atmost 2
        double probablity=0;
        for(int x=1;x<=2;x++)
        {
            probablity=binomial(n,p,x);
        }

        System.out.format("%.3f" , probablity);
        
        //Atleast 2
        /*for(int x=2;x<=n;x++)
        {
            probablity=binomial(n, p, x);
        }

        System.out.format("%.3f", probablity);
        */


    }

    private static double binomial(int n, Double p, int x)
    {
        if(n<0 || p<0 || p>1 || x<0 || n<x)
        {
            return 0;
        }
        else
        return combination(n,x) * Math.pow(p,x) * Math.pow(1-p,n-x);
    }

    private static long combination(int n, int x)
    {
        if(n<1 || x<0 || n<x)
        {
            return 0;
        }
        else
        return factorial(n)/factorial(x) * factorial(n-x);
    }

    private static long factorial(int n)
   {
       long fact=0;
       if(n==0)
       {
           return 1;
       }
       else
       {
           for(int i=0;i<=n;i++)
           {
               fact=fact*i;
           }
           return fact;
       }

    }
}