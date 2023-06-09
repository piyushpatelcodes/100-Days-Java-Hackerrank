// Challenge link : https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true

// Git Hub REPO Link :  https://github.com/piyushpatelcodes/100-Days-Java-Hackerrank


import java.util.*;

public class Simple_Array_Sum{
    public static void main(String args[]){
        int result = 0;
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        
        // System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++){
            
            result = result + sc.nextInt();

        } 
        System.out.print(result);
        
    }
}
