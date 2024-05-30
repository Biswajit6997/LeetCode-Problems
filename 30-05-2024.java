public class Solution {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int count = 0;

        // Prefix XOR array
        int[] prefixXor = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixXor[i + 1] = prefixXor[i] ^ arr[i];
        }

        // Iterate through all pairs (i, k)
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                // If the XOR from i to k is 0
                if (prefixXor[i] == prefixXor[k + 1]) {
                    // All j between i+1 and k inclusive satisfy the condition
                    count += (k - i);
                }
            }
        }

        return count;
    }