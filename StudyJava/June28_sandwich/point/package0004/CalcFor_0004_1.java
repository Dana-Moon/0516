package June28_sandwich.point.package0004;

public class CalcFor_0004_1 {

    public static int i=0;
    public static int j=0;

    public static void calcFor_0004(int numX, int numY) {
        // X = 7;
        // Y = 7;
        
        for(i=0; i<numY; i++) {
            for(j=0; j<numX; j++) {
                if(numX-j-1>i) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
