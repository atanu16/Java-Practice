package level2;

import java.util.Arrays;
import java.util.Scanner;

public class array_input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 4 numbers : ");
        int[] arr = new int[4];
        for (int i = 0; i <arr.length ; i++) {

            arr[i]=in.nextInt();

        }

        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void change(int[] num) {
        num [0] = 99;
    }
}
