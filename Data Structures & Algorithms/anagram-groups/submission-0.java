class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List <String>> res = new HashMap<>();
        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);
            res.putIfAbsent(sortedKey, new ArrayList<>());
            res.get(sortedKey).add(str);
        }
        return new ArrayList<>(res.values());
    }
}
