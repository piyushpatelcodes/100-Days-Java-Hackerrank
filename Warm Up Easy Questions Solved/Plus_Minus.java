// Challenge link : https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true

// Git Hub REPO Link : https://github.com/piyushpatelcodes/100-Days-Java-Hackerrank


import java.util.*; 

public class Plus_Minus{
    public static int ratio(int n, int arr[]){
        n= arr.length;
        float positive = 0; float negative = 0; float equal = 0;
        for(int i=0; i< arr.length; i++){
            float check = Math.signum(arr[i]);

            

            if(check == 1){
                positive = positive + 1;
            }

            if(check == -1){
                negative = negative + 1;
            }

            if(check == 0){
                equal = equal + 1;
            }
        }

        System.out.println(positive/n);
        System.out.println(negative/n);
        System.out.println(equal/n);


    return 0;}

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n]; 
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        ratio(n, arr);


    }
}
