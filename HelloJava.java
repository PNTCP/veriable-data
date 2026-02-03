package com.example.demo;   // ส่วน package

import java.util.Scanner;   // ส่วน import

public class HelloJava {    // ส่วน class

    public static void main(String[] args) {   // main method
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรุณาใส่ชื่อของคุณ: ");
        String name = scanner.nextLine();

        System.out.println("สวัสดี " + name + " ยินดีต้อนรับสู่ภาษา Java!");

        scanner.close();
    }
}
