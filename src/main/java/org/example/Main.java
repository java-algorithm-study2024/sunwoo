package org.example;

import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        int[] num_list = new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        for (int i = 0; i < num_list.length; i++) {
            for (int j = i; j < num_list.length; j++) {
                if(num_list[i] > num_list[j]){
                    int temp = num_list[i];
                    num_list[i] = num_list[j];
                    num_list[j] = temp;
                }
            }
        }
        for (int i = 0; i < num_list.length; i++) {
            System.out.print(num_list[i] + " ");
        }
    }

}