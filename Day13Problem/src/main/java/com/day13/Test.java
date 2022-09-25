package com.day13;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Test 
{
    public static void main( String[] args )
    {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int a=s.nextInt();
        System.out.println("Enter Second Number: ");
        int b=s.nextInt();
        System.out.println("Enter Third Number: ");
        int c=s.nextInt();
        if(b>a && b>c) 
        {
        	System.out.println("Second number is maximum :"+b);
        }else 
        {
        	System.out.println("other number is maximum not second number");
        }
        	
     
    }
}
