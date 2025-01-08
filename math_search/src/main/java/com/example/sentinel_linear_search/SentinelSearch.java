package com.example.sentinel_linear_search;

public class SentinelSearch {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 30;

        int index = sentinelSearch(array, target);

        if (index != -1) {
            System.out.println("Phần tử " + target + " được tìm thấy tại chỉ số " + index);
        } else {
            System.out.println("Phần tử " + target + " không tồn tại trong mảng.");
        }
    }

    public static int sentinelSearch(int[] array, int target) {
        int n = array.length;
        int last = array[n - 1]; // Lưu giá trị cuối cùng của mảng
        array[n - 1] = target;  // Đặt lính canh tại cuối mảng

        int i = 0;
        while (array[i] != target) { // Tìm kiếm không cần kiểm tra giới hạn
            i++;
        }

        // Phục hồi giá trị cuối cùng của mảng
        array[n - 1] = last;

        // Kiểm tra kết quả
        if (i < n - 1 || array[n - 1] == target) {
            return i; // Trả về chỉ số nếu tìm thấy
        }

        return -1; // Không tìm thấy
    }
}
