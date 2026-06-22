class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char a:s.toCharArray()){
            map.put(a,map.getOrDefault(a,0)+1);
        }//putting characters  and their freq in HashMap

        List<Character>[] l1=new ArrayList[s.length()+1];
        for(char a:map.keySet()){
            int freq=map.get(a);
            if(l1[freq]==null){
                l1[freq]=new ArrayList<>();
            }
            l1[freq].add(a);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=s.length();i>0;i--){
            if(l1[i]!=null){
                for(char a:l1[i]){
                    for(int pass=i;pass>0;pass--){
                         sb.append(a);
                    }
                }
            }
        }
        return sb.toString();

    }
}