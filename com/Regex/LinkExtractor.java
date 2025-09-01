package com.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkExtractor {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter text : ");
        String text = sc.nextLine();
        
        String regex = "\\bhttps?://[\\w.-]+(?:/\\S*)?\\b";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        
        System.out.println("Extracted links:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}