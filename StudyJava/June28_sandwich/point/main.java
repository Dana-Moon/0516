package June28_sandwich.point;

import java.util.ArrayList;
import java.util.Arrays;

import June28_sandwich.point.package0004.*;

public class main {
    public static void main(String[] args) {
        // startForIf();
        // 
        startreTriangle();
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

    private static void star() {
        int x =10;
        for (int i=0; i<x; i++) {
            Arrays.asList(new String[i]).stream().forEach(_row ->
                System.out.print("*"));
            System.out.println("");
        }
    }
}
