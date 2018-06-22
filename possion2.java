import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        double lambda1=0.88;
        double lamda2=1.55;
        int x=5;
        double prob1=possion(lambda1);
        double prob2=possion(lambda2);
        System.out.println(prob);
    }
    static double possion(double lambda)
    {
      double prob= Math.pow(Math.E,(-lambda))*Math.pow(lambda,x)/factorial(x);
      return prob;
    }
    static long factorial(int x)
    {
      long fact=1;
      for(int i=1;i<=x;i++)
      {
        fact=fact*i;
      }
      return fact;
    }
}
