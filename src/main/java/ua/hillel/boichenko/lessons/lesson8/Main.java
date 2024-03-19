package main.java.ua.hillel.boichenko.lessons.lesson8;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
//        O(N);
//        int N = 100;
//        for (int i = 0; i < N; i++) {
//        }
//            O(N^2)
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 8; j++) {
//
//            }
//         O(N ^3)
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                for (int k = 0; k < 5; k++) {
//
//                }
//
//            }
//
//        }

//        }
        int[] array = {4, 1, 6, -5, -9, 56, 90, 35, 799, 34, -90, 56, 345, 789};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

//        int counter = 0;
//        int[] arr = {1, -5, 6, -42, 9, 67, 234, 456, 123, 8, 23, 9};
//        int n = arr.length;
//        for (int i = 1; i < n ; i++) {
//            int key = arr[i];
//            int j = i - 1;
//            while (j >= 0 && arr[j] > key){
//                counter++;
//                arr[j + 1] = arr[j];
//                j--;
//            }
//            arr[j + 1] = key;
//        }System.out.println(Arrays.toString(arr));
//        System.out.println("Counter = " + counter);
    }
}
