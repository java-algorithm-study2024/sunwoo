package org.example;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] info = new int[n];
        for (int i = 0; i < n; i++) {
            info[i] = sc.nextInt();
        }
        int low = 0,max = 0;
        for (int i = 0; i < info.length; i++) {
            if (info[i] > max) {
                max= info[i];
            }
        }
        int answer = -1;
        while(low < max){
            int mid = (low + max)/2;
            int tree = Arrays.stream(info)
                    .map(x -> x-mid).filter(x -> x>= 0).sum();
           if ( tree >= m){
                low = mid + 1;
            }else{
                max = mid;
            }
        }
        System.out.println(answer-1);
    }

}