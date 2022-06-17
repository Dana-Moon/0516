package June16;

import java.util.Arrays;
import java.util.Scanner;


public class LockKey {
    public static void main(String[] args) {

        int[][] key = {{0,0,0}, {1,0,0}, {0,1,1}};
        int[][] lock = {{1,1,1}, {1,1,0}, {1,0,1}};
    
    }

    public boolean solution(int[][] key, int[][] lock) {
        int k = key.length;
        int l = lock.length;
        int p = l + 2*(k- 1);
        int i, j;


        int[][] paper = new int[p][p];


        for(i=k-1; i<l+k-1; i++) {
            for(j=k-1; j<l+k-1; j++){
                paper[i][j] = lock[i-k+1][j-k+1];
            }
        }


    
        




        boolean answer = true;
        return answer;
    }

    //회전시킨다.
    public static void turn(int[][] key) {
        int[][] right = new int[key.length][key[0].length];
        for(int i=0; i<right.length; i++) {
            for(int j=0; j<right.length; j++) {
                right[i][j] = key[key.length-1-j][i];
            }
        }
    }

    
}
