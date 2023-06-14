import java.util.*;

public class Birthday_Cake_Candles{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] arr = new Integer[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        

        int MaxValue = Collections.max(Arrays.asList(arr));

        int count = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == MaxValue) {
                count = count + 1;
            }

        }

        System.out.println(count);

    }
}

