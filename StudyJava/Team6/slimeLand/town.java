package Team6.slimeLand;

import java.util.Scanner;

public class town {
    public void town() {
        System.out.println("----------------------");
        System.out.println("마을에 입장하였습니다.");
        System.out.println("----------------------");
        System.out.println("");

        System.out.println("----------------------");
        System.out.println("당신은 아래 npc에게 다가갈 수 있습니다.");
        System.out.println("누구에게 다가가겠습니까?");
        System.out.println("1.장로\t2.소년\t3.목욕탕 주인");
        System.out.println("----------------------");

        Scanner scan = new Scanner(System.in);
        int npc = scan.nextInt();
        if(npc == 1) {
            System.out.println("장로 : 안녕하시오.");
            // jangro();
            //퀘스트 : 마을 주변 몬스터를 처치하러 가야 한다. 필드로 이동한다.)
            field field = new field();
            field.field();
        }
        if(npc == 2) {
            System.out.println("소년 : 안녕하세요!");
            // sonyeon();
            //퀘스트 : 주사위 게임(랜덤하게 돌아가는 주사위 2개를 굴려 똑같은 수가 먼저 나오면 이기게 된다.)
        }
        if(npc == 3) {
            System.out.println("목욕탕 주인 : 들어오겠나?");
            //mokyock();
            //퀘스트 : 목욕탕에서 판매할 훈제계란의 계란이 다 떨어졌다. 계란을 구하러 간다.)
        }
    }
}
