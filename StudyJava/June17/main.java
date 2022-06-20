package June17;

import June17.package001.*;

public class main {
    public static void main(String[] args) {
        //인스턴스 생성
        Coffee Americano = new Coffee();
        Coffee Latte = new Coffee();


        //인스턴스의 내용 출력
        System.out.println(": " + Americano.company);
        System.out.println(": " + Americano.origin);
        System.out.println(": " + Americano.kg);
        System.out.println(": " + Americano.price);

        //인스턴스의 값 출력
        Americano.price = 3000;
        System.out.println("아메리카노 가격은 " + Americano.price + "원입니다.");
        System.out.println("라떼 가격은 " + Latte.price + "원입니다.");

        //인스턴스의 값 출력
        Americano.kg = 5;
        System.out.println("Americano : " + Americano.kg + "kg입니다.");

        // int check = Latte.pricecheck();
        // System.out.println("Americano : " + calc.pricecheck(check) + "kg입니다.");
    }
}
