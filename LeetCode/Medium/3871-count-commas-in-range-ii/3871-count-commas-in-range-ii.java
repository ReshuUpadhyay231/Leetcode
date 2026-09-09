class Solution {
    public long countCommas(long n) {
        long total=0;
        long power=1_000L;
        for(int c=1;c<=5;c++){
            if(n<power){
                break;
            }
            long upper=Math.min(n,power*1000-1);
            total+=(upper-power+1)*c;
            power*=1000;
        }
        return total;
    }
}