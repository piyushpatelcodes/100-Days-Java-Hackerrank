// Challenge link : https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

// Git Hub REPO Link :  https://github.com/piyushpatelcodes/100-Days-Java-Hackerrank


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Time_Conversion{

   	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); 
        DateFormat inFormat = new SimpleDateFormat( "hh:mm:ssaa");
        DateFormat outFormat = new SimpleDateFormat( "HH:mm:ss");

        Date date = null;
        try {
            date = inFormat.parse(s); 
        }catch (ParseException e ){
            e.printStackTrace();
        }
        if( date != null ){
            String myDate = outFormat.format(date);
            System.out.println(myDate);
        }
    }

}