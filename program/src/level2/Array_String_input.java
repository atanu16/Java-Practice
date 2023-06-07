package level2;

import java.util.Arrays;
import java.util.Scanner;

public class Array_String_input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] str = new String[4];

        for (int i = 0; i < str.length; i++) {
            str[i] = in.nextLine();

        }
        System.out.println(Arrays.toString(str));


        str[1]="Atanu";

        System.out.println("Edited : "+Arrays.toString(str));
    }

}
