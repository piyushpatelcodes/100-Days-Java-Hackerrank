import java.util.*;
import java.io.*;

public class Compare_the_Triplets{
    public static int compare(int a[], int b[]){
        int aliceScore = 0;
        int bobScore = 0;
        List<Integer> scores = new ArrayList<>();
        
        
        
        for(int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                aliceScore++;
                
            }
            if (a[i] < b[i]) {
                bobScore++;
                
            }
            
        }
        scores.add(0,aliceScore);
        scores.add(1,bobScore);

        System.out.print(scores.get(0) + " " + scores.get(1));
        
            
        
    return 0;}
    
    public static void main(String args[]){
       
        int n = 3 ;
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];  
        // System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {  
            a[i]=sc.nextInt();  
        } 
        
        int[] b = new int[3];  
        // System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {  
            b[i]=sc.nextInt();  
        } 
        
        
        
        compare(a, b);
        
    }
}
