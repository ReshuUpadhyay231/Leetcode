class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] last=new int[26];
        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a']=i;
        }
        List<Integer> result=new ArrayList<>();
        int partend=0;
        int partst=0;
        for(int i=0;i<s.length();i++){
            partend=Math.max(partend,last[s.charAt(i)-'a']);
            if (i==partend){
                result.add(partend-partst+1);
                partst=i+1;
            }
        }
        return result;
    }
}