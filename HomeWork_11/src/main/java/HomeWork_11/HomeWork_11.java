package HomeWork_11;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork_11 {

    // Задание 1.
    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4, 5};

        for (int g = 0; g < nums.length; g++)
            System.out.print(nums[g] + " ");
        System.out.println();

        int n = nums[4];
        nums[4] = nums[1];
        nums[1] = n;
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    // Задача 2.

    String[] arr = {"Чудо", "юдо", "рыба", "кит"};

    List<String> list = Arrays.asList(arr);

}

