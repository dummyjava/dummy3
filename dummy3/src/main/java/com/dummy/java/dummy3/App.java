package com.dummy.java.dummy3;

import java.util.ArrayList;
import java.util.Stack;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test result:");
		System.out.println(reverseString("hello"));
		System.out.println(reverseString1("hello1"));
		System.out.println(reverseString2("hello2"));
	    System.out.println(reverseString3("hello3"));
	    System.out.println("is Hello palindrome:"+palindrome("hello"));
	    System.out.println("is civic palindrome:"+palindrome("civic"));
	    System.out.println("find first repeat char:"+findfirstrepeat("heello"));
	}
	
	@SuppressWarnings("null")
	public static String reverseString(String origin)
	{
		int len = origin.length();
		char originchars[] = origin.toCharArray();
		char resultchars[] = new char[len];		
		int i = len;
		int j = 0;
		for ( ;i>=1; i--)			
		{   
			resultchars[j] = originchars[i-1];
			j++;						
		}		
		return String.copyValueOf(resultchars);		
	}
    public static String reverseString1(String origin) {
    	StringBuffer stringbuffer = new StringBuffer(origin);
    	stringbuffer.reverse();
    	return stringbuffer.toString();
    	
    }
    
    public static String reverseString2(String origin)
    {  
    	Stack<Character> stack = new Stack<Character>();
        for(int i=0; i< origin.length(); i++) {
        	stack.push(origin.charAt(i));
        }
    	String result = "";
    	char temp;   	
    	while(!stack.isEmpty()){
    		temp =  (char) stack.pop();
    		result = result + String.valueOf(temp);
    	}
    	return result;
    	
    }
    public static String reverseString3(String origin)
    {
    	ArrayList<String> alist = new ArrayList<String>();
    	for(int i=0; i< origin.length();i++)
    	{    		
    	alist.add(String.valueOf(origin.charAt(i))); 
    	}
    	String  result = "";
    	alist.stream().filter( s -> s.contains("h"));
    	return result;
    	
    }
    public static boolean palindrome(String origin)
    {
    	String reverse = reverseString1(origin);   	
    	 if (reverse.equals(origin))
    	 {
    		 return true;
    	 }
    	 return false;
    }  	
    public static char findfirstrepeat(String origin)
    {    	
    	int len = origin.toCharArray().length;
    	char chararray[] = origin.toCharArray();
    	String string = "";
    	for (int i=0; i<= len; i++) 		
    	{
    		if(string.startsWith(String.valueOf(chararray[i])))
    	    {
    		   return chararray[i];
    		}    		
    		string = String.valueOf(chararray[i]) + string;	
    	}
    	return ' ';
    }
}
