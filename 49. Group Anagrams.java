
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap to store the sorted string as key and list of anagrams as value
        HashMap<String, List<String>> map = new HashMap<>();

        // Loop through each string in the input array
        for (String str : strs) {
            // Sort the characters of the string
            String sorted = sortString(str);
            
            // If the sorted string is not already a key in the map, add it with a new list
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            
            // Add the original string to the list corresponding to the sorted string key
            map.get(sorted).add(str);
        }

        // Create a result list to store all the groups of anagrams
        List<List<String>> result = new ArrayList<>(map.values());
        
        // Return the result list
        return result;
    }

    // Helper method to sort the characters of a string
    private String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
