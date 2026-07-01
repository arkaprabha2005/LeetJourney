class Solution {
    public boolean detectCapitalUse(String word) {
        int capital=0;
        for(char a:word.toCharArray()){
            if(Character.isUpperCase(a)) capital++;
        }

        if((Character.isUpperCase(word.charAt(0))&&capital==1) || capital==word.length() || capital==0) {return true;
        }
        return false;
    }
}