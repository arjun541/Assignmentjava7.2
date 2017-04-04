package com;

import java.util.Scanner;

public class SubStringByBuiltin {
public static void main(String a[])
{ 
	System.out.println("enter the source string");
	Scanner sc=new Scanner(System.in);//input for source string
	StringBuilder sb=new StringBuilder(sc.next());
	System.out.println("enter the search string");
	String s=sc.next();//input for search string
	if(sb.indexOf(s)==-1)//for finding whether string is found or not
		System.out.println(s+" is  not found in "+sb.toString());
	else
		System.out.println(s+" is   found in "+sb.toString());
	
	
	
}
	
	
	
}
