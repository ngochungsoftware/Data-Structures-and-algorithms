package com.example.linear_search;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 30;
        int index = linearSearch(array, target);

        if (index != -1) {
            System.out.println("Phần tử " + target + " được tìm thấy tại chỉ số " + index);
        } else {
            System.out.println("Phần tử " + target + " không tồn tại trong mảng.");
        }
    }

}
