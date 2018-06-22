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
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Solution s=new Solution();
        float mean = s.find_mean(a);
        double sd=s.find_sd(a, mean;);
        System.out.println(sd);


    }

    float find_mean(int a[])
    {
        int sum=0;
        for(i:a)
        {
            sum=sum+i;
        }
        float mean=sum/a.length+1
        return mean;
    }

    double find_sd(int a[], float mean)
    {
        double sum=0.00;
        for(i:a)
        {
            sum=sum+[(i-mean)*(i-mean)];
        }

        double sd=Math.sqrt(sum);
        return sd;
    }
}