class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> l1=new ArrayList<>();
        
        for(int i=0;i<grid.length;i++){
            l1.add(new ArrayList<>());//created rows
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                l1.get(i).add(0);//added rows
            }
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int new_index=(i*grid[0].length+j+k)%(grid[0].length*grid.length);
                int pos_x=new_index/grid[0].length;
                int pos_y=new_index%grid[0].length;
                l1.get(pos_x).set(pos_y,grid[i][j]);
            }
        }

        return l1;
    }
}