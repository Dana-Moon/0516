package Team6;

import Team6.slimeLand.*;
// import Team6.Overiding.*;;

public class main {
    public static void main(String[] args) {
        gameStart gameStart = new gameStart();
        gameStart.gameStart();

        town town = new town();
        town.town();

        // ChangeWeapon();

        // CreateSlime();

        
        
    }

    public static void fieldSlime() {
        System.out.println("용사는 야생 지역에 진입했다.");

//        System.out.println("용사의 눈 앞에 "+arrSlimeName.length+"마리의 슬라임이 나타났다!!");
//        CreateSlime();
    }

    public static void CreateSlime() {

        String[] arrSlimeName = new String[3];
        arrSlimeName[0] = "검은색";
        arrSlimeName[1] = "붉은색";
        arrSlimeName[2] = "푸른색";

        int num = (int)(Math.random()*arrSlimeName.length);
        //(int)를 써주지 않으면 소숫점이 다 나타난다.

        int input_hp = (int)(Math.random()*100);
        int input_mp = (int)(Math.random()*30);
        RedSlime red_1_slime = new RedSlime(input_hp, input_mp, arrSlimeName[num], arrSlimeName[num]);
        input_hp = (int)(Math.random()*100);
        input_mp = (int)(Math.random()*30);
        RedSlime red_2_slime = new RedSlime(input_hp, input_mp, arrSlimeName[num], arrSlimeName[num]);
        
        red_1_slime.getColor();
        System.out.println(red_1_slime.getName()+"의 공격력은 "+red_1_slime.att());
        red_1_slime.att();

        red_2_slime.getColor();
        System.out.println(red_2_slime.getName()+"의 공격력은 "+red_2_slime.att());

    }

//    public static void ChangeWeapon() {
//        WeaponLance001 lance = new WeaponLance001();
//        WeaponLongSword001 longSword = new WeaponLongSword001();
//
//        lance.attAction();
//        longSword.attAction();
//
//        lance.destruction();
//
//    }
}