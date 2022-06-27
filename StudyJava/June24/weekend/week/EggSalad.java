package June24.weekend.week;

public class EggSalad extends Sandwich{
    public static String name = "에그샐러드";
    public static String gredient = "계란, 샐러드";
    public static String dayOfWeek = "목";

    public static void sandwich() {
        System.out.println(dayOfWeek+"요일에 " +name+"샌드위치를 먹는다.");
        System.out.println(name+ " 샌드위치의 재료는 " +bread+gredient+"이다.");
    }
}
