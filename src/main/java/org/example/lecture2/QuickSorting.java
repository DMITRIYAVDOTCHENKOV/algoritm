package org.example.lecture2;

import java.util.Arrays;

public class QuickSorting {
    public static void main(String[] args) {


        int[] array = new int[]{
                2, 6, 7, 22, 4, 11, 9, 0, 44, 22, 13, 45, 66,
        };
        sort(array, 0, array.length -1);
        System.out.println(Arrays.toString(array));


    }

    public static void sort(int[] array, int startPosition, int endPosition) {
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = array[(startPosition + endPosition) / 2];
        do {
            while (array[leftPosition] < pivot) {
                leftPosition++;
            }
            while (array[rightPosition] > pivot) {
                rightPosition--;
            }
            if (leftPosition <= rightPosition) {
                if (leftPosition < rightPosition) {
                    int temp = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftPosition++;
                rightPosition--;
            }
        } while (leftPosition <= rightPosition);

        if (leftPosition < endPosition) {
            sort(array, leftPosition, endPosition);
        }
        if (startPosition < rightPosition) {
            sort(array, startPosition,rightPosition);
        }
    }
}
