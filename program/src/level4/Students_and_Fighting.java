package level4;

import java.util.Scanner;

public class Students_and_Fighting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            int[] scores = new int[n];
            for (int j = 0; j < n; j++) {
                scores[j] = sc.nextInt();
            }

            int maxScore = Integer.MIN_VALUE;
            for (int score : scores) {
                if (score > maxScore) {
                    maxScore = score;
                }
            }

            int numTopper = 0;
            for (int score : scores) {
                if (score == maxScore) {
                    numTopper++;
                }
            }

            if (numTopper > 1) {
                System.out.println("fight:(");
            } else {
                System.out.println("peace:)");
            }
        }
    }

}
