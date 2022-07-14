package July07.programmers;

import java.util.Arrays;
import java.util.ArrayList;

public class Moeugosa {
    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5,1,2,3,4,5};
        MoeugosaPlay(answers);

    }

    public static ArrayList<Integer> MoeugosaPlay(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[][] temp = {
                {1,2,3,4,5},
                {2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5}
        };
        int[] sum = {0,0,0};
        int i = 0;
        int j = 0;

        for(i = 0; i<answers.length; i++) {
            for(j = 0; j<temp.length; j++) {
                if (answers[i] == temp[j][i%temp[j].length]) {
                    sum[j]++;
                }
            }
        }

        Arrays.sort(sum);
        answer.add(sum[0]);
        for(j=0; j<sum.length; j++) {
            if(answer.get(0) == sum[j]) {
                answer.add(sum[j]);
            }
        }

        return answer;
    }
}
