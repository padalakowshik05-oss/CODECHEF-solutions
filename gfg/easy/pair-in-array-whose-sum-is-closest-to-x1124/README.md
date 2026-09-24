# Closest Pair Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  and a number  **target**, find a pair of elements (a, b) in  **arr[],** where a ≤ b whose sum is closest to  **target.** 

 **Note:** Return the pair in sorted order and if there are multiple such pairs return the pair with maximum absolute difference. If no such pair exists return an empty array.

 **Examples:** 

```
Input: arr[] = [10, 30, 20, 5], target = 25
Output: [5, 20]
Explanation: As 5 + 20 = 25 is closest to 25.

```

```
Input: arr[] = [5, 2, 7, 1, 4], target = 10
Output: [2, 7]
Explanation: As (4, 5), (2, 7) and (4, 7) both are closest to 10, but absolute difference of (4, 5) is 1, (2, 7) is 5 and (4, 7) is 3. Hence, [2, 7] has maximum absolute difference and closest to target. 
```

```
Input: arr[] = [10], target = 10
Output: []
Explanation: As the input array has only 1 element, return an empty array.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T14:55:52.383Z  

```java
class Solution {
    public ArrayList<Integer> sumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        ArrayList<Integer> ans=new ArrayList<>();
        int[] a=new int[2];
        int diff=Integer.MAX_VALUE;
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int sum=arr[l]+arr[r];
            int diff1=Math.abs(target-sum);
            if(diff1<diff){
                diff=diff1;
                ans.clear();
                ans.add(arr[l]);
                ans.add(arr[r]);
            }
            if(sum<target){
                l++;
            }else{
                r--;
            }
        }
        
        return ans;
        
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/pair-in-array-whose-sum-is-closest-to-x1124/1)