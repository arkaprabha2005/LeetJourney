class Solution {
    public String[] createGrid(int m, int n) {
        String[] op=new String[m];
        int k=0;
        for(int i=0;i<m;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++){
                if(i==0 || j==n-1) sb.append('.');
                else sb.append('#');
            }
            op[k++]=sb.toString();
        }
        return op;
    }
}