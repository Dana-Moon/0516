package June28_sandwich.point;

import java.util.ArrayList;
import java.util.Arrays;

import June28_sandwich.point.package0004.*;

public class main {
    public static void main(String[] args) {
        // startForIf();
        // 
        // eleven();
        twelve();
    }

    private static void startForIf() { //직사각형

        int numX = 7;
        int numY = 6;
        int numZ = 3;

        CalcFor_0001.calcFor_0001(numX, numY);
    }

    private static void startTriangle() { //왼쪽 직각삼각형
        int numX = 7;
        int numY = 6;

        CalcFor_0002.calcFor_0002(numX, numY);
    }

    private static void star() {  //람다식 직각삼각형
        int x =10;
        for (int i=0; i<x; i++) {
            Arrays.asList(new String[i]).stream().forEach(_row ->
                System.out.print("*"));
            System.out.println("");
        }
    }

    private static void startreTriangle() { //오른쪽 직각삼각형
        int numX = 7;
        int numY = 6;

        CalcFor_0003.calcFor_0003(numX, numY);
    }

    private static void startreTriangle2() { //오른쪽 직각삼각형2
        int numX = 7;
        int numY = 7;

        CalcFor_0004.calcFor_0004(numX, numY);
    }

    private static void startreTriangle3() { //오른쪽 직각삼각형 if문
        int numX = 7;
        int numY = 7;
        
        CalcFor_0004_1.calcFor_0004(numX, numY);
    }

    private static void startjeongTriangle() { //정삼각형
        int numX = 7;
        int numY = 7;

        CalcFor_0005.calcFor_0005(numX, numY);
    }

    private static void diamond1() {
        int numX = 7;
        int numY = 7;

        CalcFor_0005_1.calcFor_0005(numX, numY);
    }

    private static void diamond3() {  //예진이 마름모
        int numX = 7;
        int numY = 7;

        CalcFor_0006_Yejin.calcFor_0006(numX, numY);
    }

    private static void diamond2() {  //나례언니 마름모
        int numX = 6;
        int numY = 6;

        CalcFor_0007_Narye.calcFor_0007(numX, numY);
    }

    private static void circle() {  //원
        int n = 15;

        for(int i = -n; i<=n; i++) {
            for (int j= -n; j<=n; j++) {
                if(i*i+j*j<=n*n) {
                    System.out.print("+");
                    System.out.print(" ");
                }
                else {
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
    
    private static void eleven() {
        //가로 60 세로 30에 모두 별, 좌측 중앙에 가로10 높이10의 @삼각형, 우측 하단에 가로10 세로10 #역삼각형
        int numX = 60;
        int numY = 30;
        int i = 0;
        int j = 0;
        int k = 0;
        String[][] bayeol = new String[numX][numY];

        //배열 담기
        for(i=0; i<numY; i++) {
            for(j=0; j<numX; j++) {
                bayeol[j][i] = "*";
            }
        }
        for(i=9; i<20; i++) {
            for(j=14-k; j<14+k+1; j++) {
                bayeol[j][i] = "@";
            }
            k++;
        }
        k=0;
        for(i=19; i<30; i++) {
            for(j=40+k-1; j<60-k; j++) {
                bayeol[j][i] = "#";
            }
            k++;
        }


        //출력하기
        for(i=0; i<numY; i++) {
            for(j=0; j<numX; j++) {
                System.out.print(bayeol[j][i]);
            }
            System.out.println();
        }
    }

    private static void twelve() {
        int numX = 61;
        int numY = 61;
        int i = 0;
        int j = 0;
        int k = 0;

        String[][] place = new String[numX][numY];

        for(i=0; i<numY; i++) {
            for(j=0; j<numX; j++) {
                place[j][i] = " ";
            }
        }

        for(i=0; i<30; i++) {   //위에 삼각형
            for(j=30-k; j<30+k+1; j++) {
                place[j][i] = "*";
            }
            k++;
        }
        k=0;
        for(i=30; i<61; i++) {  //아래 삼각형
            for(j=0+k; j<61-k; j++) {
                place[j][i] = "*";
            }
            k++;
        }
        k=0;

        for(i=0; i<numY; i++) {
            for(j=0; j<numX; j++) {
                System.out.print(place[j][i]);
            }
            System.out.println();
        }
    }
}
