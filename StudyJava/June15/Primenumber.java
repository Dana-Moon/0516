package June15;

import java.util.ArrayList;

class Primenumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        System.out.println(solution(nums));
    }


    public static int solution(int[] nums) {
        int i, j, k;

        ArrayList<Integer> prime = new ArrayList<Integer>();

        for(i=0; i<nums.length-2; i++) {
            for(j=i+1; j<nums.length-1; j++) {
                for(k=j+1; k<nums.length; k++) {
                    prime.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        int count = 0;
        int answer = 0;

        for(i=0; i<prime.size(); i++){
            count = 0;
            for(j=2; j<prime.get(i); j++){
                if(prime.get(i)%j == 0){
                    count++;
                }
            }
            if(count == 0) {
                answer++;
            }
        }

        return answer;
    }
}