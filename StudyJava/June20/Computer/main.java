package June20.Computer;

import java.util.Scanner;

import June20.Computer.package0001.*;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("os타입을 입력하세요");
        System.out.println("1. MAC OS일 경우는 1을 입력하세요");
        System.out.println("2. Windows OS일 경우는 2를 입력하세요");
        
        // String inputComputerOS = input.nextLine();
        // System.out.println("CPU!!");
        // String inputComputerCPU = input.nextLine();
        // System.out.println("RAM!!");
        // String inputComputerRAM = input.nextLine();
        // System.out.println("SSD!");
        // String inputComputerSSD = input.nextLine();




        // ComputerSpec Macbook2021 = new ComputerSpec(inputComputerCPU, inputComputerRAM, inputComputerSSD);

        // System.out.println("CPU : " + Macbook2021.CPU + " / RAM : " + Macbook2021.RAM + " / SSD : " + Macbook2021.SSD);

        // System.out.println(Macbook2021.CPU);
        // System.out.println(Macbook2021.RAM);
        // System.out.println(Macbook2021.SSD);

        

        int osType = input.nextInt();
        Oscheck oscheck = new Oscheck();
        oscheck.osCheck(osType);

        boolean checkComputerWhile = true;
        ArrayList<String> computerArray = new ArrayList<String>();

        boolean branch = false;
        String checkOk= "";
        String computerInputData = "";

        while(checkComputerWhile) {
            System.out.println("컴퓨터 사양을 입력해 주세요");
            System.out.println("ex) cpu:i7, ram:8g, ssd:256GB");

            computerInputData = input.nextLine();

            System.out.println("입력하신 내용이 다음과 같습니까? 맞으면 yes, 아니면 no를 입력해 주세요");
            System.out.println(computerInputData);
            checkOk = input.nextLine();

            branch = CheckYn.CheckYn(checkOk, "inputCheck");
            if(branch) {
                computerArray.add(computerInputData);
            }else {
                continue;
            };

            System.out.println("데이터를 계속 입력하겠습니까? 맞으면 yes, 아니면 no를 입력해 주세요");
            checkOk = input.nextLine();
            branch = CheckYn.CheckYn(checkOk, "brakeCheck");


        }
    }
}
