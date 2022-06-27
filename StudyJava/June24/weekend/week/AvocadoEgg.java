package June24.weekend.week;

public class AvocadoEgg extends Sandwich{
    public static String name = "아보카도에그";
    public static String gredient = "아보카도, 계란";
    public static String dayOfWeek = "금";
    
    public static void sandwich() {
        System.out.println(dayOfWeek+"요일에 " +name+"샌드위치를 먹는다.");
        System.out.println(name+ " 샌드위치의 재료는 " +bread+gredient+"이다.");
    }
}
