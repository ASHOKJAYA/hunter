/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	 static boolean isSubset(int arr1[], 
                int arr2[], int m, int n)
    {
        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < m; j++)
                if(arr2[i] == arr1[j])
                    break;
             
            /* If the above inner loop 
            was not broken at all then
            arr2[i] is not present in
            arr1[] */
            if (j == m)
                return false;
        }
         
        /* If we reach here then all
        elements of arr2[] are present
        in arr1[] */
        return true;
    }
     
    // Driver code
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int arr1[]=new int[a];
		for(int i=0;i<a;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int arr2[]=new int[b];
		for(int i=0;i<b;i++)
		{
			arr2[i]=sc.nextInt();
		}
        //int arr1[] = {11, 1, 13, 21, 3, 7};
        //int arr2[] = {11, 3, 7, 1};
         
        int m = arr1.length;
        int n = arr2.length;
     
        if(isSubset(arr1, arr2, m, n))
            System.out.print("YES");
        else
            System.out.print("NO"); 
    
	
	// your code goes here
		//
	//	for(int i=0;i<n;i++)
	//	{
	//		if(arr[i]==i)
	//		{
	//			System.out.print(arr[i]);
	//		}
	//	}
	//	
	}
}
