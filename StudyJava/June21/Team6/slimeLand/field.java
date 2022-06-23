package June21.Team6.slimeLand;

import java.util.Scanner;
import java.util.Random;

public class field {
    public void field() {
        System.out.println("----------------------");
        System.out.println("야생으로 나가시겠습니까?");
        System.out.println("1.전투 시작\t2.마을로 돌아가기\t3.게임 종료");
        System.out.println("----------------------");

        Scanner scan = new Scanner(System.in);
        int number_battle = scan.nextInt();
        if(number_battle == 1) {
            System.out.println("----------------------");
            System.out.println("몬스터가 나타났다!");
            System.out.println("----------------------");

            Random ran = new Random();
            snail snail = new snail();
            slime slime = new slime();
            Dragon dragon = new Dragon();
            int n = 0;
            for(int i=0; i<10; i++) {
                n = ran.nextInt(3);
                if(n == 0) {
                    snail.info();
                }
                else if(n == 1) {
                    slime.info();
                }
                else if(n == 2) {
                    dragon.info();
                }
                System.out.println("전투가 시작되었다!");
            }
            
            System.out.println("게임이 종료되었습니다.");
            
        }
        if(number_battle ==2) {
            town town = new town();
            town.town();
        }
        if(number_battle == 3) {
            System.out.println("게임이 종료되었습니다.");
        }
    }
}
