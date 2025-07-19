//Approach-1 (Using set and substring find)
//T.C : O(n*L^2)
//S.C : O(n) //You can consider the length of each character as well - O(n*L)
class Solution {
    public List<String> removeSubfolders(String[] folder) {
        // Create a set from the folder array
        Set<String> folderSet = new HashSet<>(Arrays.asList(folder));
        List<String> result = new ArrayList<>();

        // Iterate over each folder in the array
        for (String currFolder : folder) {
            boolean isSubFolder = false;
            String tempFolder = currFolder;

            // Continue until currFolder is empty
            while (!currFolder.isEmpty()) {
                int position = currFolder.lastIndexOf('/');  // Find the last occurrence of '/'
                if (position == -1) break;  // Exit if there are no more '/' characters

                currFolder = currFolder.substring(0, position);  // Get the parent folder

                // Check if the parent folder exists in the set
                if (folderSet.contains(currFolder)) {
                    isSubFolder = true;  // It is a sub-folder
                    break;
                }
            }

            // If it's not a sub-folder, add it to the result list
            if (!isSubFolder) {
                result.add(tempFolder);
            }
        }

        return result;
    }
}
