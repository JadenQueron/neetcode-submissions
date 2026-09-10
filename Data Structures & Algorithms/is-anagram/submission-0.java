class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        int[] counts = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            // increment counts for s.charAt(i)
            counts[s.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < t.length(); i++) {
            // decrement counts for t.charAt(i)
            counts[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i<26;i++){
            if(counts[i] != 0){
                return false;
            }
        }
        return true;
        // loop through counts array — if any value != 0, return false
        // otherwise return true
    }
}