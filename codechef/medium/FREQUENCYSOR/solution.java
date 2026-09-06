public static String sortByFrequency(String s) {

    int[] freq = new int[128];

    // Count frequency of each character
    for (int i = 0; i < s.length(); i++) {
        freq[s.charAt(i)]++;
    }

    // Store characters that occur
    Character[] chars = new Character[62];
    int count = 0;

    for (int i = 0; i < 128; i++) {
        if (freq[i] > 0) {
            chars[count++] = (char) i;
        }
    }

    // Sort:
    // 1. Higher frequency first
    // 2. ASCII order if frequency is same
    Arrays.sort(chars, 0, count, (a, b) -> {
        if (freq[a] != freq[b]) {
            return Integer.compare(freq[b], freq[a]);
        }

        return Character.compare(a, b);
    });

    // Build result
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < count; i++) {
        char ch = chars[i];

        for (int j = 0; j < freq[ch]; j++) {
            result.append(ch);
        }
    }

    return result.toString();
}