package com.cg;

public class String_Practice {
    public static void main(String[] args) {
        String s1= " HelloJavaDeveloper";
        String s2= " helloJavaDeveloper";
        String s = new String("Hi");
      //  String s4=s.concat("hi");// if we make a ref for this then s4 = Hihi
        String s4 ="Hi";
        String s3=  s1.concat(s2);
        System.out.println(s3);// HelloJavaDeveloper helloJavaDeveloper
        System.out.println(s);// Hi
        StringBuffer a = new StringBuffer("hi");
        System.out.println(s.equals(a));//   False  ---compair value of string
        System.out.println(s1.equals(s2));// false
        System.out.println(s1.equalsIgnoreCase(s2)); // true
        System.out.println(s1==s2);//false
        System.out.println(s==s4);// false  -- checking adress in memory
        System.out.println(s3.compareTo(s1));
    }
}
