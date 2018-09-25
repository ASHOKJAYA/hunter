import java.util.*;
import java.lang.*;
import java.io.*;
class pro8
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
      if(b==c||k==1)
      {
        System.out.println(a[b-1]);
       }
       else
       {
        while(b!=c)
        {
          if(b>c)
          {
              b=b-c;
           }
           else
           {
           c=c-b;
           }
           }
           System.out.print(b);
           }
       }
   }
}
