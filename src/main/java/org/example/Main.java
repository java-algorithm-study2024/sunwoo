package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] temp = br.readLine().split(" ");
        int dish_num = Integer.parseInt(temp[0]);
        int sushi_variety = Integer.parseInt(temp[1]);
        int sequence_dish = Integer.parseInt(temp[2]);
        int coupon = Integer.parseInt(temp[3]);
        int []sushi_table = new int[dish_num + sequence_dish];
        for (int i = 0; i < dish_num; i++) {
            sushi_table[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < sequence_dish; i++) {
            sushi_table[dish_num + i] = sushi_table[i];
        }
        int max = 0;

        for (int i = 0; i < sushi_table.length; i++) {
            Set<Integer> sushi_set = new HashSet<>();
            for (int j = i; j < i + sequence_dish; j++) {
                sushi_set.add(sushi_table[j]);
            }
            max = Math.max(max, sushi_set.size());
        }
        System.out.println(max);

    }
}
