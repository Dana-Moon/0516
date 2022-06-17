package June13;

import java.util.ArrayList;
// 파일을 가져다 쓸 때도 import를 사용해야 한다.
// java안에 util안에 arraylist를 불러서 쓰는 것이다. java.util.*로도 사용할 수 있지만, 이렇게 하면 용량을 너무 많이 잡아먹으므로 좋은 방법은 아니다.

public class progammers3 {
    public static void main(String[] args) {
        //main은 시작점을 알려주는 기준.
        // os마다 통로가 달리 있는데, 그 통로가 되는 것이 String[]이다.???
        System.out.println("programmers start");

        // String[] inputText = {"Kim", "Jane"};
        // list String = new list[5];
        // (1) String - 고정 length, equals : 따로 생성한다.(메소드가 아니라 속성이라 괄호를 쓰지 않는다.)
        // (2) String-buffer - 가변 length() : 메모리를 따로 생성하여 잇지 않고 그냥 붙이면 된다.
        // (3) ArrayList - 가변 size()
        ArrayList<String> inputArray = new ArrayList<String>();
        //ArrayList 안의 타입 값은 String만 받겠다.
        //new 인스턴스를 만든다.
        inputArray.add("Jane");
        inputArray.add("Kim");
        System.out.println(solution(inputArray));
        // print는 이어서 가로로 찍고, println은 한줄 띄어서 아래에 작성한다는 뜻.        
        //위에 static이라고 쓰면 아래 public에서도 static이라고 작성해주어야 한다. main이라는 곳에서 static이라는 것을 작성했다면(그러한 파일이라면) 
    }


    public static String solution(ArrayList<String> inputArray) {

        System.out.println(inputArray.size());
        String answer = "";

        String[] array_name=new String[3];
        array_name[0]="Kim";
        array_name[1]="Park";
        array_name[2]="Yi";
        System.out.println(inputArray.size());
        for(int i=0; i<inputArray.size(); i++) {
            // if(array_name[i].equals("Kim")) {
            if(inputArray.get(i) == "Kim") {
                System.out.println("ok");

            }
        }
        //고정배열만 equals를 쓸 수 있다.
        //name은 속성을 통해서 길이를 알 수 있다.
        //inputArray는 가변속성이기 때문에 size를 사용합니다.
        // java, c, c++은 기본적으로 주소값이 일치하는지를 알아보고자 한다. 그 도구가 바로 equals이다.
        //if(seoul.get(i).equals("kim"))
        //검색 추천 문장 : java 값 비교(주소비교, 값비교)
        //위치 저장
    
        StringBuffer text_test = new StringBuffer("helloww");
        // 가능하면 메모리 생성 주기(라이프사이클)를 최소화로 만들기 위해서 빈번한 문장은 Stringbuffer를 되도록 사용한다.
        text_test.append("abc");
        System.out.println(text_test.length());


        return answer;
        // return answer 하면 int와 String이 충돌하여 빨간 줄 생김.

        //string buffer? arraylist랑 list를 구분지어 기억할 것.}
        
    }
}

