package Team6.Overiding;

import Team6.slimeLand.*;

public class WeaponBasic001 {
    public static final String defaultName = "주먹";
    public static final int defaultAttRange = 1;
    public static final int defaultChangeTime = 1;

    public String name = "주먹";
    public int attRange = 1;
    public int changeTime = 1;

    public void attAction() {
        System.out.println("무기 : "+this.name+"을 장착하였습니다.");
    }

    public void destruction() {
        System.out.println("무기가 파괴되었습니다.");
    }

    public void destructionBefore(String input_name, int input_attRange, int input_changeTime) {
        this.name = input_name;
        this.attRange = input_attRange;
        this.changeTime = input_changeTime;
    }
}
