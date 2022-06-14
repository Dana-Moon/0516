public class progammers {
    public static void main(String[] args) {
        System.out.println("programmers start");

        String inputText = "text input";
        System.out.println(solution(inputText));
        
        //위에 static이라고 쓰면 아래 public에서도 static이라고 작성해주어야 한다. main이라는 곳에서 static이라는 것을 작성했다면(그러한 파일이라면) 
    }

    public static String solution(String text) {
        String answer = text;
        return answer;
        // return answer 하면 int와 String이 충돌하여 빨간 줄 생김.
    }
}

