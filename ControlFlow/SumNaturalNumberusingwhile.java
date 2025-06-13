package ControlFlow;

import java.util.Scanner;

public class SumNaturalNumberusingwhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        int sum1=0;

        if (number >= 0) {
            int sum = number * (number + 1) / 2;
            while(number > 0) {
                sum1 += number;
                number--;
            }
            if(sum==sum1)
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
