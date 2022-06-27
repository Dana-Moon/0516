package June21.Team6.slimeLand;

public class Warrior {
    public static String name;
    public static int hp = 100;
    public static int mp = 50;
    public static int offpower = 5;

    public Warrior(String input_name, int input_hp, int input_mp, int input_offpower) {
        this.name = input_name;
        this.hp = input_hp;
        this.mp = input_mp;
        this.offpower = input_offpower;
    }

    public static void setName(String input_name) {
        name = input_name;
    }

    public static int att() {
        return 10;
    }

    public static int att_A() {
        mp -= 10;
        return 30;
    }

    public static int att_B() {
        mp -= 20;
        return 50;
    }

    public static void dmg(int input_dmg) {
        hp = hp - input_dmg;
        System.out.println("용사는 " +input_dmg+ "의 공격을 받았습니다.");
        System.out.println("용사의 hp : "+hp);
    }

    public static void info() {
        System.out.println("----------------------");
        System.out.println(name);
        System.out.println("HP = " + hp);
        System.out.println("MP = " + mp);
        System.out.println("공격력 = " + offpower);
        System.out.println("----------------------");
    }
}
