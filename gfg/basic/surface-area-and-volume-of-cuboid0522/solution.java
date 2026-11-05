class Solution {
    public int[] find(int l, int b, int h) {
        int surfaceArea = 2 * (l * b + b * h + h * l);
        int volume = l * b * h;

        return new int[]{surfaceArea, volume};
    }
}