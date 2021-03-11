package com.cg.l6.ui;

import java.util.HashMap;
import java.util.Set;

public class Student {

       public HashMap<String,String> getStudent(HashMap<String,Integer> stu) {
    	   HashMap<String,String> medal = new HashMap<>();
    	   Set<String> set = stu.keySet();
    	   
    	   for(String s:set) {
    		   Integer marks = stu.get(s);
    		   if(marks>=90) {
    			   medal.put(s,"Gold");
    		   } else if(marks >=80) {
    			   medal.put(s,"Silver");
    		   } else if(marks>=70) {
    			   medal.put(s,"Bronze");
    		   }
    	   }
    	   return medal;
       }
       
       public static void main(String[] arr)  {
              
    	   HashMap<String,Integer> stu = new HashMap<>();
    	   Student s = new Student();
    	   stu.put("A123",65);
    	   stu.put("B123",76);
    	   stu.put("C123",89);
    	   stu.put("D123",90);
    	   stu.put("E123",93);
    	   System.out.println(s.getStudent(stu));
       }

}
