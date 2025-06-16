package Arrays;
import java.util.Scanner;
public class MulTable {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for multiplication table");
        int n=sc.nextInt();
        //create an array of size 10 to store the multiplication table
        int[] table=new int[10];
        //fill the array with the multiplication table of n
        for(int i=0;i<10;i++){
            table[i]=(i+1)*n;
        }
        //print the multiplication table
        for(int i=0;i<10;i++){
            System.out.println(n+" * " + (i+1) + " = " + table[i]);
        }
        sc.close();
    }
}
