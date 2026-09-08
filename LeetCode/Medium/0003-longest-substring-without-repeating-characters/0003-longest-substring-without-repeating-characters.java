class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int st=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);

            if(map.containsKey(curr) && map.get(curr)>=st){
                st=map.get(curr)+1;
            }
            map.put(curr,i);
            maxlen=Math.max(i-st+1,maxlen);
        }
        return maxlen;
    }
}