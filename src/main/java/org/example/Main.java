package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static int answer = 0;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int check, count = 0;
        for (int i = 0; i < num; i++) {
            check = sc.nextInt();
            if(check==1) {
                count += 1;
                answer += count;
            }else{
                count = 0;
            }
        }
        System.out.println(answer);
    }
}