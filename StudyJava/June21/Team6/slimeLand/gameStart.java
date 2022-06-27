package June21.Team6.slimeLand;

import java.util.Scanner;

public class gameStart {
    public void gameStart() {
        System.out.println("게임 스타트!!");

        System.out.println("1.게임 시작 \t 2.게임 종료");
        Scanner scan = new Scanner(System.in);
        int startNumber = scan.nextInt();

        while(true) {
            if(startNumber == 1) {
                characterInfo();
                break;
            }
            if(startNumber == 2) {
                System.out.println("게임을 종료합니다.");
                break;
            }
            
        }
    }

    public void characterInfo() {
        String input_name = "";
        int weaponNumber = 0;
        String name = "";
        int offpower = 5;
        Scanner scan = new Scanner(System.in);
     
        System.out.println("----------------------");
        System.out.println("용사의 이름을 정해주세요!!");
        input_name = scan.nextLine();
        System.out.println("----------------------");

        System.out.println("----------------------");
        System.out.println("무기를 선택해주세요!!");
        System.out.println("1.막대기\t2.야구방망이\t3.백과사전");
        System.out.println("----------------------");
        
        weaponNumber = scan.nextInt();
        Weapon weapon = new Weapon(name, offpower);
        weapon.chooseWeapon(input_name, weaponNumber, offpower);

        Warrior.setName(input_name);
        
        Warrior.info();
    }
}
