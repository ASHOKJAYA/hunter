import java.util.*;
import java.lang.*;
import java.io.*;
class pro13
{
  public static void main(String[] args) throws java.lang.Exception
  {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
		String k=s.toUpperCase();
		int count=0;
		for(int i=65;i<=90;i++)
		{
			char c=(char)(i);
			//System.out.println(c);
			String d=Character.toString(c);
			//System.out.println(d);
			if(k.contains(d))
			{
				count++;
			}
		}
		//System.out.println(count);
		if(count==26)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
