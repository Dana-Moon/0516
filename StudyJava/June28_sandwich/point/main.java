package June28_sandwich.point;

import java.util.ArrayList;
import java.util.Arrays;

import June28_sandwich.point.package0004.*;

public class main {
    public static void main(String[] args) {
        // startForIf();
        // 
        triAngle();
    }

    private static void startForIf() {

        int numX = 7;
        int numY = 6;
        int numZ = 3;

        CalcFor_0001.calcFor_0001(numX, numY);
    }

    private static void startTriangle() {
        int numX = 7;
        int numY = 6;

        CalcFor_0002.calcFor_0002(numX, numY);
    }

    private static void startreTriangle() {
        int numX = 7;
        int numY = 6;

        CalcFor_0003.calcFor_0003(numX, numY);
    }

    private static void startreTriangle2() {
        int numX = 7;
        int numY = 7;

        CalcFor_0004.calcFor_0004(numX, numY);
    }

    private static void startreTriangle3() {
        int numX = 7;
        int numY = 7;
        
        CalcFor_0004_1.calcFor_0004(numX, numY);
    }

    private static void startjeongTriangle() {
        int numX = 7;
        int numY = 7;

        CalcFor_0005.calcFor_0005(numX, numY);
    }

    private static void diamond2() {
        int numX = 7;
        int numY = 7;

        CalcFor_0005_1.calcFor_0005(numX, numY);
    }

    private static void triAngle() {
        int numX = 7;
        int numY = 7;

        CalcFor_0006_Yejin.calcFor_0006(numX, numY);
    }

    private static void diamond1() {
        int numX = 6;
        int numY = 6;

        CalcFor_0007_Narye.calcFor_0007(numX, numY);
    }

    private static void diamond() {
        int numX = 6;
        int numY = 6;
    }

    private static void star() {
        int x =10;
        for (int i=0; i<x; i++) {
            Arrays.asList(new String[i]).stream().forEach(_row ->
                System.out.print("*"));
            System.out.println("");
        }
    }
}
