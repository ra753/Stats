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
        Arrays.sort(a);

        int mdpt=n/2;

        float q1=a[mdpt]+[mdpt+1]/2;


        

        int q2=findmdpt(0,mdpt);
        int q3=findmdpt(mdpt+1,n);

        System.out.println(q1+q2+q3);


    }

    float findmed(int a[],int start,int end)
        {
            int mid=end-start/2;
            float m=(a[mid-1]+a[mid])/2;
            return mid;
        }
}