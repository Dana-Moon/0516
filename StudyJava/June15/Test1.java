class Test1 {
    public static void main(String[] args) {
        Number number1 = new Number(); //왼쪽이 계획 오른쪽이 실행
        Number number2 = new Number();

        number1.numStatic++; //클래스 필드 num을 1증가시킴
        number1.numNormal++;
        System.out.println("static 1 = "+number1.numStatic);
        System.out.println("instance 1 = "+number1.numNormal);
        System.out.println("static 2 = "+number2.numStatic);
        System.out.println("instance 2 = "+number2.numNormal);
    }
}

    class Number{
        
        static int numStatic = 10; //스태틱 필드. 넘1과 넘2가 공유된다.
        int numNormal = 10; //인스턴스 필드
    }

