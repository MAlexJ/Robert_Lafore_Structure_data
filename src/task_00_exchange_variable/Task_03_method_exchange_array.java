package task_00_exchange_variable;

import java.util.Arrays;

public class Task_03_method_exchange_array {
    public static int[] array = new int[2];

    public static void main(String[] args) {
        array[0] = 34;
        array[1] = 56;
        System.out.println(Arrays.toString(array));

        swap(array);
        System.out.println(Arrays.toString(array));

    }

    public static void swap(int[] array) {
        int result = array[0];
        array[0] = array[1];
        array[1] = result;
    }
}
