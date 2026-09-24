import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int largestCommonElement(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0;
        int j=0;
        int largest=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                largest=arr1[i];
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                
                j++;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();
        for (int i = 0; i < m; i++) arr2[i] = sc.nextInt();
        System.out.println(largestCommonElement(arr1, arr2));
    }
}