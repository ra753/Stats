import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a[]=new double[n];
        double b[]=new double[n];
        for(int i=0;i<n;i++)
        {
          a[i]=sc.nextDouble();
        }
        for(int i=0;i<n;i++)
        {
          b[i]=sc.nextDouble();
        }

        double mean_a = calc_mean(a);
        double mean_b = calc_mean(b);
        double sda = calc_sd(a, mean_a);
        double sdb = calc_sd(b, mean_b);

        double pearson_coff=pearson(a,b,sda,sdb,mean_a,mean_b);

        System.out.println(pearson_coff);
/*
        System.out.println(mean_a);
        System.out.println(mean_b);
        System.out.println(sda);
        System.out.println(sdb);

  */
    }
    static double calc_mean(double a[])
    {
      double sum=0;
      for(double i:a)
      {
        sum=sum+i;
      }
      return sum/a.length;
    }

    static double calc_sd(double a[], double mean)
    {
      double temp=0;
      for(double i:a)
      {
        temp = temp + Math.pow((i-mean),2);
      }
      return Math.sqrt(temp/a.length);
    }

    static double pearson(double a[], double b[], double sda, double sdb, double mean_a, double mean_b)
    {
      double sum=0;
      for(int i=0;i<a.length;i++)
      {
        sum= sum + (a[i]-mean_a) * (b[i]-mean_b);
      }

      return sum/(sda*sdb*a.length);
    }
}
