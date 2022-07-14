package June14;

import java.util.ArrayList;
import java.util.Arrays;

class Choosetwo_copy_2 {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};

        System.out.println(Arrays.toString(solution(numbers)));
    }

    public static int[] solution(int[] numbers) {
        int i, j;
        ArrayList<Integer> sum = new ArrayList<Integer>();

        for(i = 0; i<numbers.length-1; i++) {
            for(j = i+1; j<numbers.length; j++){
                if(!sum.contains(numbers[i] + numbers[j])){
                sum.add(numbers[i] + numbers[j]);
                }
            }
        }

        int[] answer = new int[sum.size()];

        for(i = 0; i<sum.size(); i++){
            answer[i] = sum.get(i);
        }

        Arrays.sort(answer);
        return answer;
    }
}
