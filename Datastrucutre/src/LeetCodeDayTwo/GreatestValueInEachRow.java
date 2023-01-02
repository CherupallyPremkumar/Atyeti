package LeetCodeDayTwo;

import java.util.Arrays;

public class GreatestValueInEachRow {

        public static int deleteGreatestValue(int[][] grid) {
            for(int i = 0; i < grid.length; i++) {
                Arrays.sort(grid[i]);
            }
            int ans = 0;
            for(int col = 0; col < grid[0].length; col++) {
                int max = 0;
                for(int row = 0; row < grid.length; row++) {
                    max = Math.max(max, grid[row][col]);
                }
                ans += max;
            }
            return ans;
        }
        public static int delete(int[][] grid)
        {
             for (int i=0;i<grid.length;i++)
             {
                 Arrays.sort(grid[i]);
                 System.out.println(Arrays.toString(grid[i]));
             }


            return 0;
        }

    public static void main(String[] args) {
       int[][] arr={{1,2,4},{3,3,1}};
        System.out.println(delete(arr));
    }
    }

