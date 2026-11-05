class Solution {
    public double findArea(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return 0.0;
        }

        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        return Math.floor(area * 1000) / 1000.0;
    }
}