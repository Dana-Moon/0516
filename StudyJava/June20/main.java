package June20;

import java.util.Scanner;
import June20.package003.*;

public class main {
    public static void main(String[] args) {
        //*계획서
        // 1) 데이터를 받아오는 방식 : API 방식(네트워크) / Excel 파일 읽어오기(파일 로딩) / CLI(terminal에서 데이터 받아오기, Scanner를 써야 한다.)
        // 2) 조별 실행학습 = 취업, 평가지
        // - 쉬운 것을 만들어보도록 하자.
        // - 컴퓨터 데이터를 받고, 풀어보도록 한다.
        // 3) 문제
        // - 김준석 선생님은 컴퓨터를 사고 싶다.
        // - 프로그래밍으로 사고 싶은 컴퓨터의 성능지표를 출력하는 시스템을 개발하고 싶다.
        // - 데이터를 받아오고, 그 데이터를 통해 컴퓨터의 성능을 출력하는 시스템 개발이다.
        // - 무슨 데이터냐 : 컴퓨터 이름(맥북pro 2021 이런 식으로)
        // - CPU성능
        // - RAM
        // - SSD(혹은 하드디스크)
        // - 단, 데이터가 없는 필드값에 대해 오버로딩으로 처리하시오.
        // - extra. 데이터가 부족할 경우, 여러 데이터를 동시에 받을 경우에 대해 고민해보세요.
        // - extra. 배열, if문, for문 복합적으로 쓰시면 어떨까요?
        // - Scanner로 데이터를 받아오시오.


        //인스턴스 생성
        //model은 null이 나오게 된다.
        // Overloading car1 = new Overloading();
        // System.out.println("car1.company : " + car1.company);
        // System.out.println("car1.company : " + car1.model);
        // System.out.println();

        // Overloading car2 = new Overloading("model_name");
        // System.out.println(": " + car2.company);
        // System.out.println(": " + car2.model);
        // System.out.println();

        // Overloading car3 = new Overloading("model_name", "black");
        // System.out.println("car3.company : " + car3.company);
        // System.out.println("car3.company : " + car3.model);
        // System.out.println("car3.color : " + car3.color);
        // System.out.println();

        // Overloading car4 = new Overloading("model_name", "black", 200);
        // System.out.println("car4.company : " + car4.company);
        // System.out.println("car4.model : " + car4.model);
        // System.out.println("car4.color : " + car4.color);
        // System.out.println("car4.maxSpeed : " + car4.maxSpeed);
        

        Scanner input = new Scanner(System.in);
        System.out.println("Student Name!!");
        String inputStudentName = input.nextLine();

        System.out.println("Subject!!");
        String inputSubjectName = input.nextLine();

        System.out.println("Grade!!");
        int inputGradeName = input.nextInt();

        System.out.println("student : " + inputStudentName + "//subject : " + inputSubjectName + "//grade : " + inputGradeName);


        //input 데이터 무결성 체크(데이터가 잘 왔는지)
        //인자값을 통해 인스턴스 생성자 생성

        StudentGrade student = new StudentGrade();
        StudentGrade student_1 = new StudentGrade(inputStudentName);
        StudentGrade student_2 = new StudentGrade(inputStudentName, inputSubjectName, inputGradeName);

        System.out.println(student.ClassName);
        System.out.println("--------");
        System.out.println(student_2.ClassName);
        System.out.println(student_2.name);
        System.out.println(student_2.grade);
        System.out.println("--------");
        // System.out.println();
    }
}
