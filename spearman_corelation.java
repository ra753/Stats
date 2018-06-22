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
          double a[]= new double[n];
          double b[]= new double[n];
          int flag= eqaulity_checker(a);
          int flag2= eqaulity_checker(b);
          if(flag+flag2>0)
          {
            double mean_a = calc_mean(a);
            double mean_b = calc_mean(b);
            double sda = calc_sd(a, mean_a);
            double sdb = calc_sd(b, mean_b);

            double pearson_coff=pearson(a,b,sda,sdb,mean_a,mean_b);

            System.out.println(pearson_coff);
          }
          else
          double r= spearman(a, b);
          System.out.println(r);

    }

    static int eqaulity_checker(Double a[])
    {
      int flag=0;
      Arrays.sort(a);
      for(int i=1;i<n;i++)
      {
        for (int j=i-1; j<n-1 ;j++ )
        {
          if(a[i]==a[j])
          {
            flag=1;
            break;
          }

        }
      }
      return flag;
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

    static double spearman(double a[], double b[],double sda, double sdb, double mean_a, double mean_b)
    {
      double sum=0;
      for(int i=0;i<a.length; i++)
      {
        sum
      }
    }

    static double covariance(double a, double b, double sda, double sdb, double mean_a, double mean_b)
    {
      return (a*mean_a) + (b*mean_b)/(sda*sdb);
    }
}
