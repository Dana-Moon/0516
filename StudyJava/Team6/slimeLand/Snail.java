package Team6.slimeLand;

public class Snail {
    //필드값

    public String name;
    public int hp;
    public int mp;

    //생성자
    public Snail() {
        this.name = "달팽이";
        this.hp = 5;
    }

    public Snail(String input_name, int input_hp, int input_mp) {
        this.name = input_name;
        this.hp = input_hp;
        this.mp = input_mp;
    }

    public void dmg(int dmg) {
        System.out.println("용사는 "+ dmg +"의 공격을 했습니다.");
        this.hp -= dmg;
        System.out.println(this.name + "은 " +dmg+ "의 공격을 받았습니다.");
    }

    public int att() {
        return 1;
    }

    public void info() {
        System.out.println("_______"+name+"________");
        System.out.println("HP = " + this.hp);
    }
}
