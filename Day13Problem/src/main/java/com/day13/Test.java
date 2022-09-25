package com.day13;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Test 
{

	public static String findmaxstrimg(String a, String b, String c)
    {
		String maximum=a;
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
        {
            return a;

        }


        if (b.compareTo(a) > 0 && b.compareTo(c) > 0)
        {
            return b;

        }
        if (c.compareTo(a) > 0 && c.compareTo(b) > 0)
        {
            return c;

        }
		return maximum;
	}
	public static void main(String[] args)
	{
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter first String: ");
	 String a=s.next();
	 System.out.println("Enter Second Number: ");
	 String b=s.next();
	 System.out.println("Enter Third Number: ");
	 String c=s.next();
	 String  output=Test.findmaxstrimg(a, b, c);
     System.out.println("Maximum String is :"+output);

		        
	}

}
