class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        Set<Character> hash = new HashSet<>();
        int maxLen = 0;
        for(int r=0;r<s.length();r++){
            while(hash.contains(s.charAt(r))){
                hash.remove(s.charAt(l));
                l++;     
            }
            hash.add(s.charAt(r));
            maxLen = Math.max(maxLen, r-l+1);
        }
        return maxLen;
    }
}
