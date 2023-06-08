// Challenge link : https://www.hackerrank.com/challenges/arrays-ds/problem?isFullScreen=true

// Git Hub REPO Link :  https://github.com/piyushpatelcodes/100-Days-Java-Hackerrank

import java.util.*;

public class hackerrankpractice{
    public static int arrayreverse(int arr[]){

//         System.out.print("reversed array: ");
        for(int i = arr.length - 1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }

        
    return 0;} 



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the array range");
        int size = sc.nextInt();
        int[] arr = new int[size];
//         System.out.println("Enter the elements of the array ::");  
  
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }  

        arrayreverse(arr);

        }
}
