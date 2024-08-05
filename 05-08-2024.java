 Map<String, Integer> frequencyMap = new HashMap<>();
        
        // Populate the frequency map
        for (String str : arr) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }
        
        // Create a map to preserve the order of insertion
        Map<String, Integer> orderedMap = new LinkedHashMap<>();
        
        // Filter only distinct strings (frequency = 1)
        for (String str : arr) {
            if (frequencyMap.get(str) == 1) {
                orderedMap.put(str, 1);
            }
        }
        
        // Iterate through the ordered map to find the k-th distinct string
        int count = 0;
        for (String key : orderedMap.keySet()) {
            count++;
            if (count == k) {
                return key;
            }
        }
        
        // If there are fewer than k distinct strings, return an empty string
        return "";