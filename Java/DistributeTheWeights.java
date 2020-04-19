/*
You are given an integer array A of size N and an integer M. You have to distribute the elements of array A into M groups such that the maximum sum of elements in each group is minimum and the elements of array A allotted to any group is contiguous.

Write a program to determine the maximum sum of elements among all the groups.

Input format

First line: T (number of test cases)
For each test case
First line: Two space-separated integers N and M
Second line: N space-separated integers (denoting the elements of the array)
Output format
For each test case, print the maximum sum of elements among all the groups in a new line.

Constraints:
1<=t<=100
1<=m<=n<=10^4
1<=a[i]<=10^5

Input:
1
5 3
1 2 3 4 5
Output:
6

Explanation
Best possible way to distribute the given 5 elements into 3 bags is to :-
Group 1:- {1,2,3}
Group 2:- {4}
Group 3:- {5}
Hence answer will 1+2+3=6.
*/

import java.util.*;
class DistributeTheWeights {
  
 
    static boolean check(int mid, int array[], int n, int K)  
    { 
          
        int count = 0;  
        int sum = 0;  
        for (int i = 0; i < n; i++)  
        {  
 
            if (array[i] > mid)  
                return false;  
      
            // Increase sum of current sub - array  
            sum += array[i];  
      
            // If the sum is greater than  
            // mid increase count  
            if (sum > mid)  
            {  
                count++;  
                sum = array[i];  
            }  
        }  
        count++;  
      
        // Check condition  
        if (count <= K)  
            return true;  
        return false;  
    }  
      
    // Function to find maximum subarray sum  
    // which is minimum  
    static int solve(int array[], int n, int K)  
    {  
        int start = 1;  
        int end = 0;  
      
        for (int i = 0; i < n; i++) 
        {  
            end += array[i];  
        }  
      
        // Answer stores possible  
        // maximum sub array sum  
        int answer = 0;  
        while (start <= end)  
        {  
            int mid = (start + end) / 2;  
      
            // If mid is possible solution  
            // Put answer = mid;  
            if (check(mid, array, n, K)) 
            {  
                answer = mid;  
                end = mid - 1;  
            }  
            else
            {  
                start = mid + 1;  
            }  
        }  
      
        return answer;  
    }  
      
    
    public static void main(String args[] ) throws Exception {
     Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      for(int i=0;i<t;i++)
      {
       int n=sc.nextInt();
       int m=sc.nextInt();
       int []a=new int[n];
       for(int j=0;j<n;j++)
		{
			a[j]=sc.nextInt();
		}
         System.out.println(solve(a,n,m));
      }
    }
}
