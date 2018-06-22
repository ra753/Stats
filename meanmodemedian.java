import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        //int arr[];
        int arr[]=new int[n];   
        //input array:
        float sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //Mean Clac:
        for(int i:arr)
            sum =sum+i;
        float mean=sum/n;
        System.out.println(mean);
        ///////
        
        //Median
        Arrays.sort(arr);
        int mdpt=(n+1)/2;
        double median=(arr[mdpt-1]+arr[mdpt])/2.0;
        System.out.println(median);
        ////////
        
        //Mode
        /*int hash[]=new int [100];
        for(int j:hash)
            j=0;
        
        for(int i=0;i<n;i++)
        {
            int val=arr[i]/100;
            hash[val]++;
        }
        */
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
                else
                    large[i]=count;
                    larelement[i]=arr[i];
                    count=0;
            }
        }
    }
}