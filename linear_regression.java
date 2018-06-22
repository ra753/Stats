import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        double x[] = {95, 85, 80, 70, 60};
        double y[] = {85, 95, 70, 65, 70};
        int X = 80;

        /* Linear Regression -> Y=a+bx
        b= prearson_coff(x,y) * sd(a)/sd(b)
        a= mean(y) - b * mean(x)
        */

        double mean_a = calc_mean(x);
        double mean_b = calc_mean(y);
        double sda = calc_sd(x, mean_a);
        double sdb = calc_sd(y, mean_b);


        // for finding b:
        double b= pearson(x, y, sda, sdb, mean_a, mean_b) * (sdb/sda);
        double a= mean_b - (b * mean_a);
        double linear_regg = a + b*X;
        System.out.format("%.3f", linear_regg);

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
