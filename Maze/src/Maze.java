public class Maze {

    //Returns the count of the shortest distance
    //Time = O(N^2) Time O(N^2)
    static int shortestPath(String[][] matrix, int[] start, int[] end){
        //create a boolean 2 Dimensional Array that is the same one as the Matrix Array
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] visited = new boolean[m][n];
        //Give Each index in the 2 Dimensional Array a true or false value
        //If 0, then true if 1 then false
        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                visited[i][j] = matrix[i][j].equals("X");
            }
        }
        //returns the smallest count given by the visitedUntil function
        //For the shortest param, it is given Integer.MAX_VALUE
        //For the dist param it is given 0 as the starting value
        return visitedUtil(matrix, start, end, visited, Integer.MAX_VALUE, 0);
    }

    //recursion function that returns the shortest distance
    static int visitedUtil(String[][] matrix, int[] start, int[] end, boolean[][] visited, int shortest, int dist){
        //x and y values of the starting and end position
        int sx = start[0], sy = start[1];
        int dx = end[0], dy = end[1];
        // if the value is beyond the matrix range or pair in invalid return
        if(matrix[sx][sy].equals("X") || matrix[dx][dy].equals("X") || !isValid(matrix,sx, sy, visited)){

            return Integer.MAX_VALUE;
        }

        //If destination is found return which value is smaller, the dist or shortest param
        if(sx == dx && sy == dy && matrix[sx][sy].equals("T")){
            return Math.min(dist, shortest);
        }
        //mark current spot as visited
        visited[sx][sy] = true;

        //moving up
        if(isValid(matrix, sx, sy+1, visited)){
            shortest = visitedUtil(matrix, new int[]{sx, sy+1},end, visited, shortest, dist +1);
        }
        //moving down
        if(isValid(matrix, sx, sy-1, visited)){
            shortest = visitedUtil(matrix, new int[]{sx, sy-1},end, visited, shortest, dist +1);
        }

        //moving left
        if(isValid(matrix, sx-1, sy, visited)){
            shortest = visitedUtil(matrix, new int[]{sx-1, sy},end, visited, shortest, dist +1);
        }

        //moving right
        if(isValid(matrix, sx+1, sy, visited)){
            shortest = visitedUtil(matrix, new int[]{sx+1, sy},end, visited, shortest, dist +1);
        }

        //backtracking in case no options are good
        visited[sx][sy] = false;
        //return the shortest number
        return shortest;

    }

    //utility function to check the x,y pair is valid
    private static boolean isValid(String[][] matrix, int x, int y, boolean[][] visited) {
        return x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length && (matrix[x][y].equals("T") || matrix[x][y].equals("_") || matrix[x][y].equals("O")) && !visited[x][y];
    }


    static int[] find(String[][]matrix, String string){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j].equals(string)){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String string = "__OX__;_X____;_XXX__;____TX;XXXXXX;";
        String[] stringSplit = string.split(";");
        int length = stringSplit.length;
        String[][] matrix = new String[length][stringSplit[0].length()];
        for(int i =0; i <length; i++){
            String[] part = stringSplit[i].split("");
            matrix[i] = part;
        }
        int[] start = find(matrix, "O");
        int[] end = find(matrix, "T");
        for (String[] strings : matrix) {
            for (String s : strings) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
        /**int [][] matrix = {
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0}
        };
        int[] start = {0,2};
        int[] end = {3, 4};
         */
        System.out.println(shortestPath(matrix,start,end));
    }
}
