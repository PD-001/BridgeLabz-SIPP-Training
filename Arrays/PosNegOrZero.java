
package Arrays;
import java.util.Scanner;
public class PosNegOrZero {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 integers:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                if(arr[i]%2==0){
                    System.out.println(arr[i]+" is a positive even number");
                }
                else{
                    System.out.println(arr[i]+" is a positive odd number");
                }
            }
            else if(arr[i]<0){
                System.out.println(arr[i]+" is a negative number");
            }
            else{
                System.out.println(arr[i]+" is zero");
            }
        }
    }
}
