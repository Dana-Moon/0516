package June20.Computer.package0001;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Oscheck {
    public static void osCheck(int checkType) {
        if(checkType == 1) {
            System.out.println("Computer Type은 Mac OS입니다.");
        }else if(checkType == 2) {
            System.out.println("Computer Type은 Windows OS입니다.");
        }else {
            System.out.println("정상적인 입력이 아닙니다.");
        }
    }
}
