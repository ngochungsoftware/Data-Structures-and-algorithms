package com.example.jump_search;

public class JumpSearch {
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        // Bước nhảy là căn bậc hai của kích thước mảng
        int step = (int) Math.sqrt(n);
        int prev = 0;
        // Tìm khoảng chứa giá trị cần tìm
        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.sqrt(n);
            if (prev >= n) {
                return -1; // Giá trị không tồn tại trong mảng
            }
        }
        // Tìm kiếm tuyến tính trong khoảng tìm được
        while (arr[prev] < target) {
            prev++;
            // Nếu đã vượt qua kích thước mảng hoặc giá trị cần tìm
            if (prev == Math.min(step, n)) {
                return -1;
            }
        }
        // Kiểm tra nếu tìm thấy giá trị cần tìm
        if (arr[prev] == target) {
            return prev;
        }
        return -1; // Giá trị không tồn tại
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 15;

        int index = jumpSearch(arr, target);

        if (index != -1) {
            System.out.println("Phần tử " + target + " được tìm thấy tại chỉ số: " + index);
        } else {
            System.out.println("Phần tử " + target + " không tồn tại trong mảng.");
        }
    }
}
