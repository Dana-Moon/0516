package June28_sandwich.point.package0004;

public class CalcFor_0007_Narye {

    public static int i=0;
    public static int j=0;
    public static int k=0;
    public static int l=0;

    public static void calcFor_0007(int numX, int numY) {
        // X = 7;
        // Y = 7;
        
        for(i=0; i<5; i++) {
            for(j=6; j-1>i; j--) {
                System.out.print(" ");
            }
            for(k=0; k<i; k++) {
                System.out.print("*");
            }
            for(l=0; l<i; l++) {
                System.out.print("*");
            }
            System.out.print("*");
            System.out.println();
        }
        for(i=0; i<6; i++) {
            for(j=0; j<i; j++) {
                System.out.print(" ");
            }
            for(k=5; k>i; k--) {
                System.out.print("*");
            }
            for(int l=5; l>i; l--) {
                System.out.print("*");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
