class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
         List<Map.Entry<Character, Integer>> entries = new ArrayList<>(map.entrySet());

        entries.sort((a, b) -> b.getValue() - a.getValue());
        String ss="";
        for(Map.Entry<Character, Integer> entry : entries){
            for(int j=0;j<entry.getValue();j++)
            ss+=entry.getKey();
        }
        return ss;
    }
}