class Solution {
    public int minBitFlips(int start, int goal) {
        int x=start^goal;
        String s=Integer.toBinaryString(x);
        int l=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
            l++;
        }
        return l;
    }
}