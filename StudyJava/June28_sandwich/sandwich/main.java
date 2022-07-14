package June28_sandwich.sandwich;

import java.util.jar.Manifest;

import June28_sandwich.sandwich.package0001.abocadoSand;
import June28_sandwich.sandwich.package0001.blueberrySand;
import June28_sandwich.sandwich.package0001.eggSaladSand;
import June28_sandwich.sandwich.package0001.lettuceSand;
import June28_sandwich.sandwich.package0001.sweetPumpkinSand;
import June28_sandwich.sandwich.package0002.sandwich_another;

public class main {
    public static void main(String[] args) {
        startSandwich();
    }

    private static void startSandwich() {
        sandwich_another[] sandwiches = new sandwich_another[5];

        sandwiches[0] = new blueberrySand("월요일", "블루베리베이컨", "빵", "버터", "블루베리", "베이컨");
        sandwiches[1] = new lettuceSand("화요일", "상추베이컨", "빵", "버터", "상추", "베이컨");
        sandwiches[2] = new sweetPumpkinSand("수요일", "단호박", "빵", "버터", "단호박", "");
        sandwiches[3] = new eggSaladSand("목요일", "에그샐러드", "빵", "버터", "계란", "샐러드");
        sandwiches[4] = new abocadoSand("금요일", "아보카도에그", "빵", "버터", "아보카도", "계란");
        
        
        for(int i=0; i<5; i++){
            
        }
    }

    
}
