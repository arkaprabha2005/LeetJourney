class Solution {
    public String finalString(String s) {
        Deque<Character> dq=new ArrayDeque<>();
        boolean flag=false;
        for(char i:s.toCharArray()){
            if(i=='i'&& flag==false){
                flag=true;
            }
            else if(i=='i'&& flag==true){
                flag=false;
            }

            else if(flag==false){
                dq.offerFirst(i);
            }
            else{
                dq.offerLast(i);
            }
        }

        char[] output=new char[dq.size()];
        int i=0;
        while(!dq.isEmpty()){
            output[i++]=dq.poll();
        }

        StringBuilder op=new StringBuilder(new String(output));

        if(flag==true){
            return op.toString();
        }
        return op.reverse().toString();
    }
}