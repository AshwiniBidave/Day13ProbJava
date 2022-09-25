package com.day13;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Test <T>
      {
        public T a,b,c;
	public Test(T a, T b, T c)
	    {
	     this.a=a;
	     this.b=b;
	     this.c=c;
            }
	public static <T extends Comparable<T>> T findmaxstring(T a, T b, T c)
        {
	  T maximum=a;
	  if (b.compareTo(maximum) > 0)
	  {
	   maximum=b;
	  }
	  if (c.compareTo(maximum) > 0)
	  {
	   maximum=c;
	  }
	   showmaxvalue(a,b,c,maximum);
	   return maximum;
	}
         public static <T> void showmaxvalue(T a,T b,T c,T maximum)
        {
	  System.out.println("Maximum String is :"+maximum);	
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
        findmaxstring(a, b, c);
        showmaxvalue();
    }

    private static void showmaxvalue()
   {
	
    }

}
