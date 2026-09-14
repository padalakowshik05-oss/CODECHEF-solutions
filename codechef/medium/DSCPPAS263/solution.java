import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=0;
        int[][] a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=1;
                sum+=a[i][j];
            }
        }
        if(sum%2==0){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}