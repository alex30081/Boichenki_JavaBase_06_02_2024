package main.java.ua.hillel.boichenko.lessons.lesson8;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int counter = 0;
        int[] arr = {1, -5, 6, -42, 9, 67, 234, 456, 123, 8, 23, 9};
        int n = arr.length;
        for (int i = 1; i < n ; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key){
                counter++;
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }System.out.println(Arrays.toString(arr));
        System.out.println("Counter = " + counter);
    }
}
