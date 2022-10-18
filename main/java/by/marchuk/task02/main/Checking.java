package by.marchuk.task02.main;

import java.util.Scanner;

public class Checking{
    public static void main(String[] args){
        System.out.println("Enter the something");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(checkString(s));
    }

    public static boolean checkString(String s){
        try{
            Integer.parseInt(s);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}
//        Enter the something
//        45
//        true