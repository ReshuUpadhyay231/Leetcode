class Solution {
    public String largestNumber(int[] nums) {
        String[] st=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            st[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(st,new Comparator<String>(){
            public int compare(String a,String b){
                String or1=a+b;
                String or2=b+a;
                return or2.compareTo(or1);
            }
        });
        if(st[0].equals("0")){
            return "0";
        }
        StringBuilder lnst=new StringBuilder();
        for(String numst: st){
            lnst.append(numst);
        }
        return lnst.toString();
    }
}