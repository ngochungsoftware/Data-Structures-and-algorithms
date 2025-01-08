package com.example.linear_search;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearchFromFile {
    public static int linearSearch(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "D:\\Data Structures and algorithms\\math_search\\src\\main\\java\\com\\example\\linear_search\\input.txt";
        ArrayList<Integer> numbers = new ArrayList<>();
        int target = 30;

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                int number = Integer.parseInt(scanner.nextLine());
                numbers.add(number);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy tệp: " + fileName);
            return;
        } catch (NumberFormatException e) {
            System.out.println("Dữ liệu trong file không hợp lệ.");
            return;
        }

        int index = linearSearch(numbers, target);
        if (index != -1) {
            System.out.println("Phần tử " + target + " được tìm thấy tại chỉ số " + index);
        } else {
            System.out.println("Phần tử " + target + " không tồn tại trong danh sách.");
        }
    }
}
