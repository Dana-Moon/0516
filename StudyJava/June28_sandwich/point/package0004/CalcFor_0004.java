package June28_sandwich.point.package0004;

public class CalcFor_0004 {

    public static int i=0;
    public static int j=0;

    public static void calcFor_0004(int numX, int numY) {
        // X = 7;
        // Y = 7;
        
        for(i=0; i<numY; i++) {
            for(j=numY; j-1>i; j--) {
                System.out.print(" ");
            }
            for(j=numX-i; j<numX+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
