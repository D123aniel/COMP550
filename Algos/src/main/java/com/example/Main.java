package com.example;

public class Main {
    public static void main(String[] args) {
        int [] arr = {18, 73, 9, 33, 16, 64, 58, 61, 84, 49, 27, 13, 63, 4, 50, 56, 78, 1, 93, 35, 30, 76, 14, 41, 86, 3, 75, 70, 2, 90, 28, 55, 98, 29, 57, 94, 36, 15, 23, 62, 44, 60, 72, 79, 19, 71, 89, 87, 42, 7};
        int iter = 10;
        int start = 10;
        int end = 15;
        Selection_Sort.sort(arr,iter, start, end);
    }
}