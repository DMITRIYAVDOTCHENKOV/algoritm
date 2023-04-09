package org.example.lecture1;

public class Task1 {
    public static void main(String[] args) {
        int countDel = 0;
        int n = 992;
        for (int i = 2; i < n / 2 ; i++) {
            countDel = 0;
            for (int j = 2; j <= Math.sqrt(i) + 1 ; j++) {
                if (i % j == 0){
                    countDel++;
                }
            }
            if (countDel == 0) {
                int m = n -i;
                countDel = 0;
                for (int k = 2; k <= Math.sqrt(m) + 1 ; k++) {
                    if (m % k == 0){
                        countDel++;
                    }
                }
                if (countDel == 0){
                    System.out.println(i + " " + m);
                    return;
                }
            }
        }
        System.out.println(countDel);
    }
}