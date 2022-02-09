package com.cg;

@FunctionalInterface
interface Myadd{
	int add(int x ,int y);
	
}
 interface MyString{
	 String name(String x);
 }
public class Hello {
	public static void main(String [] args) {
		
	Myadd n1 = (a,b)-> (a+b);
		
	System.out.println(n1.add(10,2));
	
	MyString n2= (x)-> {
		String s1= "Java";
		String s2= x+s1;
		return s2;
	};	
	
	System.out.println(n2.name("hello   "));
	}
	
}

