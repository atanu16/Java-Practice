package prog;

import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter value a ");
        int a = input.nextInt();
        System.out.println("Enter vale b ");
        int b = input.nextInt();
        System.out.println("Enter the value c");
        int c = input.nextInt();


        int max = a;
        if ( b > max) {

            max = b;
            
        }
        if(c>b){
            max = c;
        }

        System.out.println("largest value is "+max);
    }
}
