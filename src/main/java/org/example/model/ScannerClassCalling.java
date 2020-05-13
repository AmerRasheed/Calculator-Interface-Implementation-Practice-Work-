package org.example.model;

import java.util.Scanner;

public class ScannerClassCalling {
    public static float  scannerInteger(float n1)
    {
        boolean invalidentry = true;
        float no = 0;
        Scanner sc = new Scanner(System.in);
        while(invalidentry){
            try{
                String enterstring = sc.nextLine();
                no = Float.valueOf(enterstring);

                invalidentry = false;
                if (no<0)
                {
                    System.out.println("The entered number is a negative integer. Please enter positive number");
                    invalidentry=true;
                }
            }catch (NumberFormatException ex){
                System.out.println(ex + "The value you have just entered is not valid. Please enter some valid number");
            }
        }
        return no;
    }

    public static float  enterNumber1() {
        System.out.println("\nEnter number 1");
        float  enternum=0;
        float  value1 = ScannerClassCalling.scannerInteger(enternum);
        return value1;
    }

    public static float  enterNumber2()
    {
        System.out.println("Enter number 2 ");
        float  enternum=0;
        float  value2 = ScannerClassCalling.scannerInteger(enternum);
        return value2;
    }
}
