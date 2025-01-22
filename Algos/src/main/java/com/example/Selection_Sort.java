package com.example;

public class Selection_Sort{
    public static void sort(int[] arr, int iter, int start, int end){
        for(int i=0;i<iter;i++){
            int min = arr[i];
            int minIndex = i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        System.out.println("Iteration: "+(i+1)+": "+arrToString(arr, start, end));
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static String arrToString(int[] arr, int start, int end){
        String str = "";
        for(int i=start-1;i<end;i++){
            str += arr[i]+" ";
        }
        return str;
    }
}