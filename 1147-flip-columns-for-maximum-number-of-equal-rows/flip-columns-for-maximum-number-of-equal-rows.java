class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int max = 1;
        HashMap<List<Integer>, Integer> map = new HashMap<>();
        for (int i = 0; i < matrix.length; i ++){
            List<Integer> l1 = new ArrayList<>();
            List<Integer> l2 = new ArrayList<>();
            for (int j = 0; j < matrix[0].length; j ++){
                l1.add(matrix[i][j]); 
                l2.add(1 - matrix[i][j]);
            }
            map.put(l1, map.getOrDefault(l1, 0) + 1);
            map.put(l2, map.getOrDefault(l2, 0) + 1);
        }
        for (List<Integer> key: map.keySet()){
            max = Math.max(max, map.get(key));
        }
        return max;
    }
}