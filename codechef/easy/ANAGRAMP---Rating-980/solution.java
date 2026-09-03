import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
		    String A = sc.next();
		    String B = sc.next();
		    
		    if (A.length() != B.length()) {
		        System.out.println("NO");
		        continue; // Added continue so it skips the rest for this test case
		    }
		    
		    HashMap<Character, Integer> a1 = new HashMap<>();
		    for (int i = 0; i < A.length(); i++) {
		        char chA = A.charAt(i);
		        char chB = B.charAt(i);
		        
		        a1.put(chA, a1.getOrDefault(chA, 0) + 1);
		        a1.put(chB, a1.getOrDefault(chB, 0) - 1);
		    }
		    
		    boolean isAnagram = true;
		    for (int count : a1.values()) {
		        if (count != 0) {
		            isAnagram = false;
		            break;
		        }
		    }
		    
		    if (isAnagram) {
		        System.out.println("YES");
		    } else {
		        System.out.println("NO");
		    }
		}
	}
}