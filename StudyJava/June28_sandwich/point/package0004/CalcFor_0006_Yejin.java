package June28_sandwich.point.package0004;

public class CalcFor_0006_Yejin {

    public static int i = 0;
    public static int j = 0;

    public static void calcFor_0006(int numX, int numY) {
        // X = 7;
        // Y = 7;
        
        for(i=0; i<numY; i++) {
            for(j=0; j<numY-i; j++) {
                System.out.print(" ");
            }
            for(j=0; j<2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=numY; i>0; i--) {     //아랫쪽 삼각형
            for(j=numY; j>i; j--) {
                System.out.print(" ");
            }
            for(j=0; j<2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
