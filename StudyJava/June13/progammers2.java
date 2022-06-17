package June13;

import java.util.ArrayList;

public class progammers2 {
    public static void main(String[] args) {
        System.out.println("programmers start");

        // String[] inputText = {"Jane", "Kim"};
        ArrayList<String> inputArray = new ArrayList<String>();
        inputArray.add("Jane");
        inputArray.add("Kim");
        // System.out.println(inputArray);
        // inputArray.set(0,"June");
        // System.out.println(inputArray);
        System.out.println(solution(inputArray));
        
        //위에 static이라고 쓰면 아래 public에서도 static이라고 작성해주어야 한다. main이라는 곳에서 static이라는 것을 작성했다면(그러한 파일이라면) 
    }

    public static String solution(ArrayList<String> seoul) {
        System.out.println(seoul.size());
        String answer = "";
        // seoul 배열을 순회해서 Kim의 위치 찾기
        for(int i=0; i<seoul.size(); i++) {
            if(seoul.get(i) == "Kim") {
                System.out.println("ok");

            }
            // java, c, c++은 기본적으로 주소값이 일치하는지를 알아보고자 한다. 그 도구가 바로 equals이다.
            //if(seoul.get(i).equals("kim"))
            //검색 추천 문장 : java 값 비교(주소비교, 값비교)
            //위치 저장
        }
        // Kim은 [x:배열위치]에 있다
        // answer = text "김서방은 + [배열위치] + 에 있다." (string 불변성)
        // 불변성 : 변하지 않는다. 선언을 해주고, 할당을 해주었을 때, 그 주소값에 있는 문자열은 변하지 않는다. 만약 단어 뒤에 abc를 붙여주고 싶으면 새로운 메모리 주소를 설정해주고, 거기에 문자값을 넣은 후 그 뒤에 붙여주면 되지 않을까? 라고 컴퓨터는 생각한다.
        
        StringBuffer text_test = new StringBuffer("helloww");
        text_test.append("abc");
        System.out.println(text_test);


        return answer;
        // return answer 하면 int와 String이 충돌하여 빨간 줄 생김.

        //string buffer? arraylist랑 list를 구분지어 기억할 것.
    }
}

