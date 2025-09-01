package com.Regex;

import java.util.Scanner;

public class SecurityNumberValidator {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter security number : ");
        String secNum = sc.nextLine();
        
        String regex = "^[0-9]{3}-[0-9]{2}-[0-9]{4}$";
        
        if (secNum.matches(regex)) {
            System.out.println("\"" + secNum + "\" → Valid");
        } else {
            System.out.println("\"" + secNum + "\" → Invalid");
        }
    }
}