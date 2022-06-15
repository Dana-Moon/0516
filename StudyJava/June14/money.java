public class money {
    public static void main(String[] args) {
            int price = 3;
            int money = 20;
            int count = 4;
            System.out.println(solution(price, money, count));
        
    }

    public static long solution(int price, int money, int count) {
        // long이 초기값이다. 자스와 다른 함정이다. long이 리턴 타입이다는 뜻.
        long answer = 0;
        long sum = 0;

        for(int i = 1; i<count+1; i++) {
            sum += price * i;
        }

        if(sum > money) {
            answer = sum - money;
            
        }
        return answer;

    }
}
