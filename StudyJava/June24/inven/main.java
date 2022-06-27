package June24.inven;

import June24.inven.potion.*;

public class main {
    public static void main(String[] args) {
        usePotion();
    }


    private static void usePotion() {
        RedPotion redpotion = new RedPotion(30, 2);
        RedPotion redpotion_x3 = new RedPotion(30, 3);

        redpotion.usePotionText();
        int effectHP = redpotion.useItem(20);
        int effectHP_x3 = redpotion_x3.useItem(40);

        System.out.println("용사는 포션을 사용하여 HP "+effectHP+ "를 회복하였습니다");
        System.out.println("용사는 포션을 사용하여 HP "+effectHP_x3+ "를 회복하였습니다");
    }
}
