import java.util.*;
import java.lang.*;
import java.io.*;
class pro13
{
  public static void main(String[] args) throws java.lang.Exception
  {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
		int max=0;
		int max1=0;
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<i;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					max1++;
				}
				else
				{
					count++;
				}
			}
			if(max1==1||max1==0)
			{
				max=count;
			}
		}
		System.out.println(max+1);
	}
}
