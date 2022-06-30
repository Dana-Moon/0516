package June28_sandwich.point.package0004;

public class CalcFor_0003 {

    public static int i=0;
    public static int j=0;

    public static void calcFor_0003(int numX, int numY) {
        // X = 6;
        // Y = 6;
        
        for(i=0; i<numY; i++) {
            for(j=0; j<numX-i-2; j++) {
                System.out.print(" ");
            }
            for(j=numX-i; j<numX+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
