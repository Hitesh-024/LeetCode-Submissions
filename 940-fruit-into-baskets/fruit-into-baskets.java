class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int l=0;
        int r=0;
        int len=fruits.length;
        while(l<=r && r<len){
            map.put(fruits[r], r);
            if(map.size()>2){
                int min=Integer.MAX_VALUE;
                int minkey=0;
                for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                    if(min>entry.getValue()){
                    min=entry.getValue();
                    minkey=entry.getKey();
                    }
                }
                l=min+1;
                map.remove(minkey);
            }
            max=Math.max(r-l+1,max);
            r++;
        }
        if(max==0 && len!=0)
        max=r-l+1;
        return max;
    }
}