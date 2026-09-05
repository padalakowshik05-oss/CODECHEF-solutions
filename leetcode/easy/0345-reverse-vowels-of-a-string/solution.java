class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        for (int i = 0, j = arr.length - 1; i < j; ) {

            while (i < j && !isVowel(arr[i])) {
                i++;
            }

            while (i < j && !isVowel(arr[j])) {
                j--;
            }

            if (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        return new String(arr);
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U';
    }
}