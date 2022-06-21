package June21.Game.slimeLand;

public class Warrior {
    public String name;
    public int hp;
    public int mp;

    public Warrior(String input_name, int input_hp, int input_mp) {
        this.name = input_name;
        this.hp = input_hp;
        this.mp = input_mp;
    }

    public int att() {
        return 10;
    }

    public int att_A() {
        this.mp -= 10;
        return 30;
    }

    public int att_B() {
        this.mp -= 20;
        return 50;
    }

    public void dmg(int input_dmg) {
        this.hp = this.hp - input_dmg;
        System.out.println("용사는 " +input_dmg+ "의 공격을 받았습니다.");
        System.out.println("용사의 hp : "+this.hp);
    }

    public void info() {
        System.out.println("_______"+name+"________");
        System.out.println("HP = " + this.hp);
        System.out.println("MP = " + this.mp);
    }
}
