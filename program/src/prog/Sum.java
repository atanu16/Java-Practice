package prog;

import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of X : ");
        int x = input.nextInt();
        System.out.print("Enter the value of y : ");
        int y = input.nextInt();

        int z = x + y;
        System.out.println("So the Sum of " + x + " and " + y + " = " + z);
    }
}
