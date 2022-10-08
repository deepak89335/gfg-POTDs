class Solution {
    
     private static boolean distinctCharacters(int[] frequency, int k) {
        int count = 0;
        
        for(int i = 0 ; i < 26 ; i++) {
            if(frequency[i] != 0) {
                count++;
            }
        }
        
        if(count == k - 1) {
            return true;
        }
        
        return false;
     }
    static int countOfSubstrings(String S, int k) {
        int[] frequency = new int[26];
        int n = S.length(), result = 0;
        
        for(int i = 0 ; i < k ; i++) {
            int ch = S.charAt(i) - 'a';
            frequency[ch]++;
        }
        
        if(distinctCharacters(frequency, k)) {
            result++;
        }
        
        for(int i = k; i < n ; i++) {
            int previous = i - k;
            frequency[S.charAt(previous) - 'a']--;
            
            frequency[S.charAt(i) - 'a']++;
            
            if(distinctCharacters(frequency, k)) {
                result++;
            }
        }
        
        return result;
    }
};
