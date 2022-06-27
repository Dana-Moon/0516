package June24.weekend;

import June24.weekend.week.*;

public class main {
    public static void main(String[] args) {
        String[] arr = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        for(int i=0; i<arr.length; i++) {
            if(i == 0) {
                Blueberry.sandwich();
            }
            if(i == 1) {
                LettuceBacon.sandwich();
            }
            if(i == 2) {
                SweetPumpkin.sandwich();
            }
            if(i == 3) {
                EggSalad.sandwich();
            }
            if(i == 4) {
                AvocadoEgg.sandwich();
            }
        }
    
    }
}
