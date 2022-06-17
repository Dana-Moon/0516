package June14;

import java.util.*;

class Solution {
    public TreeSet<Integer> solution(int[] numbers) {
        TreeSet<Integer> answer = new TreeSet<Integer>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                answer.add(numbers[i] + numbers[j]);
            }
        }

        return answer;
    }
}

class Solution2 {
    public ArrayList<Integer> solution(int[] numbers) {
        HashSet<Integer> sum = new HashSet<Integer>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                sum.add(numbers[i] + numbers[j]);
            }
        }

        ArrayList<Integer> answer = new ArrayList<Integer>(sum);
        Collections.sort(answer);

        return answer;
    }
}