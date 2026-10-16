class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<int[]> index = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    index.add(new int[]{i,j});
                }
            }
        }
        int a = 0;
        while(index.size() > a){
            int x = index.get(a)[0];
            int y = index.get(a)[1];
            for(int i = 0; i < matrix.length; i++){
                matrix[i][y] = 0;
            }
            for(int i = 0; i < matrix[0].length; i++){
                matrix[x][i] = 0;
            }
            a++;
        }
    }
}
