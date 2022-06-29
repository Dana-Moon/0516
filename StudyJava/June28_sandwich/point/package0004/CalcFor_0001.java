package June28_sandwich.point.package0004;

public class CalcFor_0001 {

    public static int i=0;
    public static int j=0;

    public static void calcFor_0001(int numX, int numY) {
        
        for(i=0; i<numY; i++) {
            for(j=0; j<numX; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
