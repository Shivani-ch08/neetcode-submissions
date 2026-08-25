class Solution {

    public String encode(List<String> strs) {
        String encoded="";
        for(int i=0;i<strs.size();i++){
            String enc= strs.get(i).length() +"#"+strs.get(i);
            encoded = encoded + enc;
        }
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int delimiter = str.indexOf("#", i);
            int len=Integer.parseInt(str.substring(i,delimiter));
            String item = str.substring(delimiter+1, delimiter+1+len);
            res.add(item);
            i=delimiter+1+len;
        }
        return res;
    }
}
