class Codechef
{
	public static void main (String[] args)
	{
		// Update the blank in code given below
		String word = "Ocygen";
        char[] wordArray = word.toCharArray();
        wordArray[1] = 'x';
        word = new String(wordArray);
        System.out.println(word);
	}
}