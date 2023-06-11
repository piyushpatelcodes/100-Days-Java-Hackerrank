// Challenge link : https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

// Git Hub REPO Link :  https://github.com/piyushpatelcodes/100-Days-Java-Hackerrank


import java.util.*;

public class Mini_Max_Sum{
    public static void minmax(long arr[]){
        int size = arr.length;
        Arrays.sort(arr);
        long maxsum = 0;
        long minsum = 0;

        for(int i = 0; i< size - 1; i++){
            maxsum = maxsum + arr[i];
        }


        for(int i = 1; i < size ; i++){
            minsum = minsum + arr[i];
        }


        System.out.print(maxsum + " " + minsum);

    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        long[] arr = new long[5]; 
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextLong();
        }

        minmax(arr);
    }
}

