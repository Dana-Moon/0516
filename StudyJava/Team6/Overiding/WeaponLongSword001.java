package Team6.Overiding;

import Team6.slimeLand.*;

public class WeaponLongSword001 extends WeaponBasic001 {
    
    public WeaponLongSword001() {
        this.name = "롱소드";
        this.attRange = 3;
        this.changeTime = 3;
    }

    @Override
    public void attAction() {
        System.out.println("무기 "+this.name+"을 장착하였습니다.");
        System.out.println("무기의 공격 범위는 "+this.attRange+"입니다.");
        System.out.println("무기의 교체 시간은 "+this.changeTime+"입니다.");
    }

    @Override
    public void destruction() {
        super.destructionBefore(super.defaultName, super.attRange, super.defaultChangeTime);
        attAction();
    }
}
