class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> seen1 = new HashMap<>();
        HashMap<Character, Integer> seen2 = new HashMap<>();
        for(char str : s.toCharArray()){
            seen1.put(str, seen1.getOrDefault(str, 0) + 1);
        }
        for(char str : t.toCharArray()){
            seen2.put(str, seen2.getOrDefault(str, 0) + 1);
        }
        return seen1.equals(seen2);
    }
}
