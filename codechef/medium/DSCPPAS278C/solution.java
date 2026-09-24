import java.util.Scanner;

public class Main {
    public static boolean checkSquareSum(long c) {
        int i=1;
        int j=(int)Math.sqrt(c)-1;
        while(i<j){
            int sum=(i*i)+(j*j);
            if(sum==c){
               return true; 
            }
            else if(sum<c){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long c = scanner.nextLong();

        if (checkSquareSum(c)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
