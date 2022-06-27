package June24.weekend.week;

public class Blueberry extends Sandwich{
    public static String name = "블루베리";
    public static String gredient = "블루베리, 베이컨";
    public static String dayOfWeek = "월";

    public static void sandwich() {
        System.out.println(dayOfWeek+"요일에 " +name+"샌드위치를 먹는다.");
        System.out.println(name+ " 샌드위치의 재료는 " +bread+gredient+"이다.");
    }
}
