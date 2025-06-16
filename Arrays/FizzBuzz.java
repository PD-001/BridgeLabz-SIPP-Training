package Arrays;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(n>0){
            //if n is greater than 0, we create an array of size n-1
            //and fill it with "Fizz", "Buzz", "FizzBuzz" or the number itself
            String[] str=new String[n];
            for(int i=1;i<n;i++){
                if(i%3==0){
                    str[i-1]="Fizz";
                }
                else if (i%5==0){
                    str[i-1]="Buzz";
                }
                else if(i%3==0 && i%5==0){
                    str[i-1]="FizzBuzz";
                }
                else{
                    str[i-1]=String.valueOf(i);
                }
            }
            //print the array
            for(int i=0;i<str.length;i++){
                System.out.println(str[i]);
            }
            sc.close();
        }
    }
}
