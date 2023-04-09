package org.example.lecture2;

public class BubbleSorting {

    public static void main(String[] args) {
        int[] array = new int[]{
                2, 4, 5, 2, 8, 9, 4, 0, 3,11,22,3,444,
        };
        bubblesort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void bubblesort(int[] array) {
        int count = 0;
        boolean finish;
        do {
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finish = false;
                    count++;
                }
            }
        } while (!finish);
        System.out.println("count: " + count);
    }
}
