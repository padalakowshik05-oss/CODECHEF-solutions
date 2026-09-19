class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int needed = target - arr[i];

            if (map.containsKey(needed)) {
                ans.add(map.get(needed) + 1);
                ans.add(i + 1);
                return ans;
            }

            map.put(arr[i], i);
        }

        ans.add(-1);
        ans.add(-1);
        return ans;
    }
}