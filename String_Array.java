package com.cg;
import java.util.*;


class String_Array {
    static String reverseString(String str){
        String revStr="";
        for(int i=0;i<str.length();i++){
            revStr=str.charAt(i)+revStr;
            System.out.println(revStr);
        }
        return revStr;
        }
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //System.out.println(str);
        String[] arrOfStr = str.split(" ");
        for (int i = 0; i < arrOfStr.length; i++) {
            // Printing the elements of String array
            System.out.print(arrOfStr[i] + " ");
            //System.out.println(arrOfStr[2]);
        }
         int n;
        n = scan.nextInt();

         String op= "";
        for (int i = 0; i < arrOfStr.length; i++) {
            if(i==n){
                op=op+ reverseString( arrOfStr[i]);
               // System.out.println(op);
            }else
            {
                op=op+ arrOfStr[i];
            }
          //  if(i!=arrOfStr.length -1)
            op=op+ " ";
        }
        System.out.println(op);

    }
}
    // Hello java all
// Passing array index 1
  // output --- Hello avaj all
//Hello Java Developer