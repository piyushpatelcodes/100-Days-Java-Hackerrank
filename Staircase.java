// Challenge link : https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true

// Git Hub REPO Link :  https://github.com/piyushpatelcodes/100-Days-Java-Hackerrank



import java.util.*;
import java.io.*;


public class Staircase{
    public static void stair_pattern(int size) {
        int level = size - 1;

        for(int i = 0; i < size; i++) {
            StringBuilder s = new StringBuilder();

            for(int k = 0; k < level; k ++){
                s.append(" ");

            }

            for(int k = 0; k< size - level; k++){
                s.append("#");

            }

            level = level - 1;

            System.out.println(s.toString());



        }
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        stair_pattern(size);
    
    }
    

}

