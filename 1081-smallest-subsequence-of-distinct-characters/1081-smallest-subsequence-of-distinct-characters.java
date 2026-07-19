class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> stack=new Stack<>();
        int[] freq=new int[26];
        for(char a:s.toCharArray()){
            freq[a-'a']++;
        }

        boolean[] visited=new boolean[26];

        for(char a:s.toCharArray()){
            freq[a-'a']--;
            if(visited[a-'a']==false){//not visited
                // if(stack.isEmpty()){
                //     stack.push(a);
                // }
                
                    while(!stack.isEmpty() && a<stack.peek() && freq[stack.peek()-'a']>0){
                        visited[stack.peek()-'a']=false;
                        stack.pop();

                    }
                
                visited[a-'a']=true;
                stack.push(a);
            }   
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

    return sb.reverse().toString();



    }
}