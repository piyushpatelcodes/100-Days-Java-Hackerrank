// Challenge link : https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true

// Git Hub REPO Link :  https://github.com/piyushpatelcodes/100-Days-Java-Hackerrank


import java.util.*;

public class Diagonal_Difference{
    public static int diagonaldiff(int array[][]){
        int N = array.length;
        int d1 = 0; int d2 = 0;
        for (int k = 0; k < N; k++) {
   
            // Inner loop for columns
            for (int l = 0; l < N; l++) {
   
                // Condition for the principal
                // diagonal
                if (k == l){
                    d1 += array[k][l];
                }
   
                // Condition for the secondary diagonal
                if ((k + l) == (N - 1)){
                    d2 += array[k][l];
                }
            }
        }
   
        // System.out.println("Sum of Principal Diagonal:" + d1);
        // System.out.println("Sum of Secondary Diagonal:" + d2);

        System.out.println(Math.abs(d1 - d2));

    return 0;}
 
    public static void main(String args[]){
                
        int m, n, i, j;   
        Scanner sc=new Scanner(System.in);   
        // System.out.print("Enter the number of rows: ");   
        m = sc.nextInt();   
        // System.out.print("Enter the number of columns: ");   
        n = m;   

        int array[][] = new int[m][n];   

        // System.out.println("Enter the elements of the array: ");   
        //loop for row  
        for (i = 0; i < m; i++){  
        //inner for loop for column  
            for (j = 0; j < n; j++)  {
                array[i][j] = sc.nextInt();
            }
        }
        diagonaldiff(array);
    }
}