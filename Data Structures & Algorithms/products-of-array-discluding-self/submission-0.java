class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] res = new int[n];
        int pprod =1;
        int sprod=1;
        prefix[0]=1;
        for(int i=1;i<n;i++){
            pprod=nums[i-1]*pprod;
            prefix[i]=pprod;
        }
        suffix[n-1]=1;
        for(int i=n-2;i>=0;i--){
            sprod= nums[i+1]*sprod;
            suffix[i]=sprod;
        }
        for(int i=0;i<n;i++){
            res[i]=prefix[i]*suffix[i];
        }
        return res;
    }
}  
