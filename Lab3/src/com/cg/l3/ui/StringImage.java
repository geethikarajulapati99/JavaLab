package com.cg.l3.ui;

import java.util.Scanner;

public class StringImage {
	 public String getImage(String str) {
		 
            StringBuffer sbr = new StringBuffer(str);
            sbr.append('|');
            StringBuffer sb = new StringBuffer(str);
            sb.reverse();
            sbr.append(sb);
            return sbr.toString();
     }
	 
     public static void main(String[] arr) {
    	 
    	 	StringImage s = new StringImage();
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a String");
            String str = scan.nextLine();
            System.out.println(s.getImage(str));
     }
     
}