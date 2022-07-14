package July13;

public class SingletonExample {
    public static void main(String[] args) {
        /*
        Singleton obj1 = new Singleton();   //컴파일 에러
        Singleton obj2 = new Singleton();   //컴파일 에러
         */

        testSingleton obj1 = testSingleton.getInstance();
        testSingleton obj2 = testSingleton.getInstance();

        if(obj1 == obj2) {
            System.out.println("같은 Singleton 객체입니다.");
        } else {
            System.out.println("다른 Singleton 객체입니다.");
        }
    }
}
