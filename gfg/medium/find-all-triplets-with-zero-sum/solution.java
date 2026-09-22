class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length - 2; i++) {

            HashMap<Integer, List<Integer>> map = new HashMap<>();

            for (int j = i + 1; j < arr.length; j++) {

                int third = -(arr[i] + arr[j]);

                if (map.containsKey(third)) {

                    for (int k : map.get(third)) {

                        List<Integer> temp = new ArrayList<>();

                        temp.add(i);
                        temp.add(k);
                        temp.add(j);

                        ans.add(temp);
                    }
                }

                map.computeIfAbsent(arr[j], x -> new ArrayList<>()).add(j);
            }
        }

        return ans;
    }
}