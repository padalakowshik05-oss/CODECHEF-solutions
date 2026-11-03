import java.util.*;
class Solution
{
    public ArrayList<Integer> findUniquePair(int[] arr)
    {
        int xor = 0;
        for(int x : arr)
            xor ^= x;
        int rightbit = xor & -xor;
        int oddbucket = 0;
        int evenbucket = 0;
        for(int x : arr)
        {
            if((x & rightbit) != 0)
                oddbucket ^= x;
            else
                evenbucket ^= x;
        }
        return new ArrayList<>(
            Arrays.asList(
                Math.min(oddbucket, evenbucket),
                Math.max(oddbucket, evenbucket)
            )
        );
    }
}
