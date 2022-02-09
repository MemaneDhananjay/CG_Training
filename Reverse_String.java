package com.cg;
import java.util.Scanner;
public class Reverse_String {
    public static void main(String[] args) {
        System.out.println("Oringinal String\n");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.length());
        String rs = "";
        char ch;
       // String strArray[] = str.split(" ");

      for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            rs= ch+rs; //adds each character in front of the existing string
            System.out.println(rs);
        }
        System.out.println("Reversed String \n"+ rs);
    }
}


//anahD Memane