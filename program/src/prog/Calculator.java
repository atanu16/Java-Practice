package prog;

import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while(true){
            System.out.println("Enter An operator for Calculation :");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*'|| op == '/' || op == '%'){
                System.out.println("Enter  1st value : ");
                int n1= in.nextInt();
                System.out.println("Enter 2nd  value : ");
                int n2= in.nextInt();

                if(op== '+'){
                    ans=n1+n2;
                }
                if(op== '-'){
                    ans=n1-n2;
                }
                if(op== '*'){
                    ans=n1*n2;
                }
                if(op== '/'){
                    if(n2 !=0){
                        ans=n1/n2;
                    }

                }
                if(op== '%'){
                    ans=n1%n2;
                }


            }else  if(op=='x'|| op =='X'){
                break;
            }else {
                System.out.println("Invalid Operation !!");
            }
            System.out.println("= "+ans);
            System.out.println("[ For Terminating Press X ]");
        }

    }

}
