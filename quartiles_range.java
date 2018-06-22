import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solutioj++n. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        for(int i=0;i<n;i++)
            b[i]=sc.nextInt();
        
        int sizeofc=0;
        
        for(int i:b)
        {
            sizeofc=sizeofc+i;
        }
        int k=0;
        int c[]=new int[sizeofc];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<b[i];j++)
            {
                c[k]=a[i];
                k++;
            }
        }
        Arrays.sort(c);
            
        /*for(int i:c)
        {
            System.out.print(i+" ");
        }*/

        int mid=n/2;
        double med=0;
        if(n%2==0)
            med=c[mid];
        else
        {
            med=(c[mid]+c[mid+1])/2;
        }
        
        Solution s=new Solution();
        double q1=s.quartiles(c,0,mid-1);
        double q2= s.quartiles(c,mid+1,c.length)
        System.out.println(q1+q2);
    }

    double quartiles(int a[],int beg, int end)
    {
        int mid = (end-beg)/2;
        double q=0;
        if(mid%2==0)
            q=a[mid];
        else
            q=(a[mid]+a[mid+1])/2;

        return q;


    }
}