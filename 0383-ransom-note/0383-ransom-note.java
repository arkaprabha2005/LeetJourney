class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> h1=new HashMap<>();
        for(char a:magazine.toCharArray()){
            h1.put(a,h1.getOrDefault(a,0)+1);
        }

        for(char a:ransomNote.toCharArray()){
            if(h1.getOrDefault(a,0)==0) return false;
            h1.put(a,h1.get(a)-1);
        }
        return true;
        
    }
}