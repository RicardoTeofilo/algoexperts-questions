public class NumberOfWaysToTraverseGraph {
    /**
     *
     * @param width
     * @param height
     * @return
     */

    public static int numberOfWaysToTraverseGraphRecursive(int width, int height) {

        if(width == 1 || height == 1)
            return 1;

        return numberOfWaysToTraverseGraphRecursive(width - 1, height) +
                numberOfWaysToTraverseGraphRecursive(width, height - 1);
    }

    public static int numberOfWaysToTraverseGraphIterative(int width, int height) {

        int[][] waysToTraverseGraph = new int[height][width];

        for(int i = 0; i < waysToTraverseGraph.length; i++){
            for(int j = 0; j < waysToTraverseGraph[i].length; j++){
                if (i == 0 || j == 0){
                    waysToTraverseGraph[i][j] = 1;
                }else {
                    waysToTraverseGraph[i][j] = waysToTraverseGraph[i-1][j] + waysToTraverseGraph[i][j-1];
                }
            }
        }
        return waysToTraverseGraph[height-1][width-1];
    }
}
