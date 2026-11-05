class Solution {
    public ArrayList<Integer> properCubes(int a, int b) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 1; i * i * i <= b; i++) {
            int cube = i * i * i;

            if (cube >= a) {
                ans.add(cube);
            }
        }

        if (ans.isEmpty()) {
            ans.add(-1);
        }

        return ans;
    }
}