// Challenge link : https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=true

// Git Hub REPO Link :  https://github.com/piyushpatelcodes/100-Days-Java-Hackerrank



import java.util.*;

public class A_Very_Big_Sum{
    public static void main(String args[]){
        int n;  
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");  
        //reading the number of elements from the that we want to enter  
        n=sc.nextInt();  
        //creates an array in the memory of length 10  
        long[] array = new long[n];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {  
        //reading array elements from the user   
        array[i]=sc.nextInt();  
        }  

        long sum = 0;

        for(int i=0; i<array.length; i++){
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
