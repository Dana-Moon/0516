package July13;

public class testSingleton {
    //정적 필드
    private String a;
    private String b;
    private static testSingleton singleton = new testSingleton();
//    testSingleton abc = new testSingleton(String input_a, String input_b);

    //생성자
    private testSingleton() {}
    private testSingleton(String input_a, String input_b) {
        this.a = input_a;
        this.b = input_b;
    }

    //정적 메소드
    public static testSingleton getInstance() {
        return singleton;
    }

    public static void say() {
        System.out.println("안녕하세요.");
    }
}
