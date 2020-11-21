package aimoffer;

public class FindNumberIn2DArray {


    public boolean findNumber(int[][] matrix,int target){
        if (matrix == null || matrix.length == 0 || (matrix.length == 1 && matrix[0].length == 0)){
            return false;
        }

        int i = 0,j = matrix[0].length - 1;
        while (i <  matrix.length -1  && j >= 0){
            if (target == matrix[i][j]){
                return true;
            }
            if (target < matrix[i][j]){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        FindNumberIn2DArray findRepeatNumber = new FindNumberIn2DArray();
        int [][] matrix = new int[][]{{1,4,7,11,15},{2,5,8,12,19}};
        System.out.println(findRepeatNumber.findNumber(matrix,0));
    }
}
