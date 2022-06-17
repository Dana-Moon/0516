package June14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class solution {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        int[] answer = solution2(numbers);

        for(int i=0; i<answer.length; i++){
            System.out.print(answer[i]);
            if(i!=answer.length-1) System.out.print(", ");
        }
        
    }

    public static int[] solution2(int[] numbers) {

        HashSet<Integer> numberSet = new HashSet<Integer>();
        int sum;

        for(int i = 0; i<numbers.length; ++i) {
            for(int j = i+1; j<numbers.length; ++j){
                sum = numbers[i] + numbers[j];
                numberSet.add(sum);
            }
        }


        int i = 0;
        int[] answer = new int[numberSet.size()];

        for(int num : numberSet){
            answer[i++] = num;
        }

        Arrays.sort(answer);

        return answer;
    }
}
