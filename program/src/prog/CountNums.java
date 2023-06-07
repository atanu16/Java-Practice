package prog;

import java.util.Scanner;

public class CountNums {

    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        System.out.println("Enter Any number to check how many 5 Are there :  ");
        int n=in.nextInt();
        int c = 0;

        while(0<n){
            int rem = n%10;
            if(rem==5){
                c++;
            }
            n=n/10;

        }

        System.out.println(c);


    }
}
