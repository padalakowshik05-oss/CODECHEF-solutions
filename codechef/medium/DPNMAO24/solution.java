import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().trim();
		String[] words=s.split("\\s+");
		int c=words[words.length - 1].length();
		System.out.println(c);

	}
}
