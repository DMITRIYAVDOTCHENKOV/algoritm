package org.example.lecture1;

public class TheChanceOfLosingAcertainAmount {
    public static void main(String[] args) {
        doublefindSum(8);
    }

    private static void doublefindSum(int sum) {
        int count = 0;
        int successResult = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                for (int k = 1; k <= 6; k++) {
                    if (i + j + k == sum) {
                        successResult++;
                    }
                    count++;
                }
            }
        }
        System.out.println("Count: " + count);
        System.out.println("SuccessResult: " + successResult);
    }
}
