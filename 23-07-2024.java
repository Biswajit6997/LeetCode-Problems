class Solution {
    public int[] frequencySort(int[] nums) {
        // Create a HashMap to store element and its frequency
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Convert HashMap to a List of entries sorted by frequency (descending) and then value (descending)
        List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(freqMap.entrySet());
        sortedList.sort((a, b) -> {
            if (a.getValue() == b.getValue()) {
                return Integer.compare(b.getKey(), a.getKey()); // Sort by value (descending) if frequencies are equal
            }
            return Integer.compare(a.getValue(), b.getValue()); // Sort by frequency (ascending)
        });

        // Build the result array based on sorted list
        int[] result = new int[nums.length];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : sortedList) {
            int value = entry.getKey();
            int count = entry.getValue();
            // Fill the result array with the value according to its frequency
            for (int i = 0; i < count; i++) {
                result[index++] = value;
            }
        }

        return result;
    }
}