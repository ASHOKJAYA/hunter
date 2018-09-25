import java.util.*;
import java.lang.*;
import java.io.*;
class pro13
{
  public static void main(String[] args) throws java.lang.Exception
  {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
          a[i]=sc.nextInt();
      }
      for(int i=0;i<k;i++)
      {
          int b=sc.nextInt();
          int c=sc.nextInt();
          int d=a[b-1];
          for(int j=b-1;j<c-1;j++)
          {
          	d=d^a[j+1];
             }
         System.out.println(d);
      }
}
}
