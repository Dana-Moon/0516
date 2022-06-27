package Team6.slimeLand;

import Team6.*;

public class Weapon {
    public String name;
    private int offpower = 5;
    int number = 0;

    public Weapon(String name, int offpower) {
        this.name = name;
        this.offpower = offpower;
    }

    public void info() {
        System.out.println("----------------------");
        System.out.println("무기 = " + this.name);
        System.out.println("공격력 = " + this.offpower);
        System.out.println("----------------------");
    }

    public void chooseWeapon(String input_name, int number, int offpower) {
        if(number == 1) {
            String input_weapon_1 = "막대기";
            Weapon weapon_1 = new Weapon(input_weapon_1, this.offpower);
            weapon_1.info();
            System.out.println(input_name +"은(는) "+input_weapon_1 +"를 획득하였다!");
        }    
        else if(number == 2) {
            String input_weapon_2 = "야구방망이";
            Weapon weapon_2 = new Weapon(input_weapon_2, offpower);
            weapon_2.info();
            System.out.println(input_name +"은(는) "+input_weapon_2+"를 획득하였다!");
        }
        else if(number == 3) {
            String input_weapon_3 = "백과사전";
            Weapon weapon_3 = new Weapon(input_weapon_3, offpower);
            weapon_3.info();
            System.out.println(input_name +"은(는) "+input_weapon_3+"를 획득하였다!");
        }
    }
}
