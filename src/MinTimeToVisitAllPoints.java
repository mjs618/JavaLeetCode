import java.sql.Array;
import java.util.Arrays;

public class MinTimeToVisitAllPoints {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int num = points.length;
        int result = 0;
        for (int i = 0; i < num-1; i ++) {
            result += Math.max(Math.abs(points[i][0]-points[i+1][0]), Math.abs(points[i][1]-points[i+1][1]));
        }
        return result;

    }

    public static void main(String[] args) {
        int[][] points = {{3,4},{-1,0}};
        int [][] points2 = {};
        for (int i = 0; i <points.length ; i++) {
            System.out.println(Arrays.toString(points[i]));
            points2 [0][0] = points[0][1];
        }
        //System.out.println(minTimeToVisitAllPoints(points));

    }
}
