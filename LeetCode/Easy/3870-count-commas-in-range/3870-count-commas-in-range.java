class Solution {
    public int countCommas(int n) {
        long total=0;
        if(n>=1000){
            long upper=Math.min(n,999999);
            total+=(upper-1000+1)*1L;
        }
        if(n>=1000000){
            long upper=Math.min(n,999999999L);
            total+=(upper-1000000+1)*2L;
        }
        if(n>=1000000000){
            long upper=Math.min((long)n,9999999999L);
            total+=(upper-1000000000L+1)*3L;
        }
        return (int)total;
        
    }
}