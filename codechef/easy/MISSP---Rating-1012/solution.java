import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // Input handling
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // Number of test cases
        
        while (T-- > 0) {
            int N = sc.nextInt();  // Size of the array
            int[] Arr = new int[N];
            
            // Reading array elements
            for (int i = 0; i < N; i++) {
                Arr[i] = sc.nextInt();
            }
            
            // XOR operation to find the answer
            int ans = 0;
            for (int i = 0; i < N; i++) {
                ans ^= Arr[i];
            }
            
            // Output the result
            System.out.println(ans);
        }
        
        sc.close();  // Closing the scanner
    }
}
