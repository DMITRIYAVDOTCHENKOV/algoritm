package org.example.lecture2;

public class SortingByInserts {
    public static void main(String[] args) {
        int[] array = new int[]{
                2, 4, 5, 2, 8, 9, 4, 0, 3, 11, 22, 3, 444,
        };
        insertSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void insertSort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    count++;
                }
            }
        }
        System.out.println("count: " + count);
    }
}
