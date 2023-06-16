// Challenge link : https://www.hackerrank.com/challenges/grading/problem?isFullScreen=true

// Git Hub REPO Link :  https://github.com/piyushpatelcodes/100-Days-Java-Hackerrank

import java.util.*;
import java.math.*;

public class Grading_Students {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();


            
        
            if(grade < 38){
                System.out.println(grade);
            }




            else{
                int q = grade/5;
                int rem = grade%5;
                if(rem >= 3){
                    System.out.println((q+1)*5);
                }


                else{
                    System.out.println(grade);
                }
            }
        }
    }
}